package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import tds.Symbole;
import tds.TDS;

public class fillTDS {
	public TDS mainTDS;
	private TDS tdsCourante;
	private Tree ast;
	public LinkedHashMap<Integer,TDS> hm = new LinkedHashMap<Integer, TDS>();
	private int nbImbric =1;
	private boolean createdInFunction = false;
	private boolean createdInFunctionAsParameter = false;

	public fillTDS(Tree ast, TDS mainTDS) {
		this.mainTDS = mainTDS;
		this.tdsCourante = mainTDS;
		this.ast = ast;

		fillUNLABELLED_BLOCK(ast);
		mainTDS.setFils(hm);
	}

	private void fillUNLABELLED_BLOCK(Tree tree) {
		for (int i = 0; i < tree.getChildCount(); i++) {
			switch (tree.getChild(i).toString()) {
			case "TYPARPROCDEC":
				fillTYPARPROCDEC(tree.getChild(i));
				break;
			case "PROCEDURE_STATEMENT":
				fillPROCEDURE_STATEMENT(tree.getChild(i),"void");
				break;
			case "ACTION":
				fillACTION(tree.getChild(i));
				break;
			case "TAIL":
				for (int j = 0; j < tree.getChild(i).getChildCount(); j++) {
					switch(tree.getChild(i).getChild(j).getText()) {
					case "UNLABELLED_BLOCK":
						nbImbric++;
						TDS newTDS = new TDS(nbImbric,mainTDS);
						hm.put(newTDS.numRegion, newTDS);
						tdsCourante=newTDS;
						for (int k = 0; k < tree.getChild(i).getChild(j).getChildCount(); k++) {
							switch(tree.getChild(i).getChild(j).getChild(k).getText()) {
							case "TYPARPROCDEC":
								fillTYPARPROCDEC(tree.getChild(i).getChild(j).getChild(k));
								break;
							}
						}
						break;
					case "ACTION":

						//fillACTION(tree.getChild(i).getChild(j));
						break;
					}
				}
				break;
			default:
				break;
			}
		}

	}

	private void fillACTION(Tree tree) {
		ArrayList<Tree> parameterList = new ArrayList<Tree>();
		int nbparam =0;
		for (int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).getText()) {
			case "outreal":
				for (int j = 0; j < tree.getChild(i+1).getChildCount(); j++) {
					parameterList.add(tree.getChild(i+1).getChild(j));
					nbparam++;
				}
				Symbole s = new Symbole(tree.getChild(i).getText(), "function",nbparam,parameterList);
				tdsCourante.getPere().put(tree.getChild(i).getText(),s);
				break;
			case "outstring":
				for (int j = 0; j < tree.getChild(i+1).getChildCount(); j++) {
					parameterList.add(tree.getChild(i+1).getChild(j));
					nbparam++;
				}
				Symbole s1 = new Symbole(tree.getChild(i).getText(), "function",nbparam,parameterList);
				tdsCourante.getPere().put(tree.getChild(i).getText(),s1);
				break;
			case "outinteger":
				for (int j = 0; j < tree.getChild(i+1).getChildCount(); j++) {
					parameterList.add(tree.getChild(i+1).getChild(j));
					nbparam++;
				}
				Symbole s2 = new Symbole(tree.getChild(i).getText(), "function",nbparam,parameterList);
				tdsCourante.getPere().put(tree.getChild(i).getText(),s2);
				break;
			}
		}

	}


	private void fillPROCEDURE_STATEMENT(Tree tree,String typeReturn) {
		boolean imbrique =Ancestors(tree);
		if(imbrique) {
			nbImbric++;
		}
		TDS newTDS = new TDS(nbImbric,mainTDS);
		hm.put(newTDS.numRegion, newTDS);
		tdsCourante=newTDS;
		Tree header = tree.getChild(0);
		Tree block = tree.getChild(1);
		fillPROCH(header,typeReturn);
		fillSTATEMENT_BIS(block);

	}

	private boolean Ancestors(Tree tree) {
		Tree pere = tree.getAncestor(0);
		if(pere!=null) {
			if(pere.getText().equals("PROCEDURE_STATEMENT")) {
				return true;
			}
			else {
				Ancestors(pere);
			}
		}
		return false;
	}

	private void fillSTATEMENT_BIS(Tree block) {
		for (int i = 0; i < block.getChildCount()-1; i++) {
			createdInFunctionAsParameter  = true;
			fillTYPARPROCDEC(block.getChild(i));
		}
		Tree unlab = block.getChild(block.getChildCount()-1);
		for (int i = 0; i < unlab.getChildCount(); i++) {
			if(unlab.getChild(i).getText().equals("TYPARPROCDEC")) {
			//	System.out.println(unlab.getChild(i).getChild(1));
				createdInFunction = true;
				fillTYPARPROCDEC(unlab.getChild(i));
			}
			if(unlab.getChild(i).getText().equals("TAIL")) {
				fillUNLABELLED_BLOCK(unlab.getChild(i));
			}


		}

	}

	private void fillPROCH(Tree header,String typeReturn) {
		int nbparam=0;
		ArrayList<Tree> parameterList = new ArrayList<Tree>();
		//Cle cle = new Cle(header.getChild(0).getText());
		for (int i = 0; i < header.getChild(1).getChildCount(); i++) {
			nbparam++;
			parameterList.add(header.getChild(1).getChild(i));
		}
		Symbole s = new Symbole(header.getChild(0).getText(),typeReturn,nbparam,parameterList);
		tdsCourante.getPere().put(header.getChild(0).getText(), s);
		Symbole s1 = new Symbole(header.getChild(0).getText(),"integer","variable",tdsCourante.size());
		tdsCourante.put(header.getChild(0).getText(), s1);
	}

	private void fillTYPARPROCDEC(Tree tree) {
		if(tree.getChild(1).getText().equals("PROCEDURE_STATEMENT")) {
			fillPROCEDURE_STATEMENT(tree.getChild(1), tree.getChild(0).getText());
		}
		if(tree.getChild(1).getText().equals("array")) {
			for (int i = 2; i < tree.getChildCount(); i++) {
				if(tree.getChild(i).getText().equals("ARRAYSEG")) {
					Tree array = tree.getChild(i);
					int nb =0;
					for (int i1 = 0; i1 < array.getChildCount(); i1++) {
						if(array.getChild(i1).getText().equals("BORNES")) nb++;
					}
					//Cle cle = new Cle(array.getChild(0).getText());
					if ((array.getChild(1).getChild(0).getText().matches("[0-9]*")&&(array.getChild(1).getChild(1).getText().matches("[0-9]*")))){
						Symbole s = new Symbole(array.getChild(0).getText(), tree.getChild(0).getText(), Integer.parseInt(array.getChild(1).getChild(0).getText()), Integer.parseInt(array.getChild(1).getChild(1).getText()), nb);
						tdsCourante.put(array.getChild(0).getText(), s);
					}else{
						System.out.print("");//erreur syntaxique?
					}
				}
				else {
					if(tree.getChildCount()==3) {
						//Cle cle = new Cle(tree.getChild(2).getText());
						Symbole s = new Symbole(tree.getChild(2).getText(), tree.getChild(0).getText(), 0, 0, 0);
						tdsCourante.put(tree.getChild(2).getText(),s);
						;					}
					else {
						if(!tree.getChild(i).getText().equals(",")) {
							System.out.println("CAS DES BORNES A GERER ??");
						}

					}

				}
			}

		}
		else if(!tree.getChild(1).getText().equals("PROCEDURE_STATEMENT")) {
			if(createdInFunction) {
				for (int i = 1; i < tree.getChildCount(); i++) { // cas de l'it�rateur
					Symbole  s = new Symbole(tree.getChild(i).getText(),tree.getChild(0).getText(),"iterateur" , tdsCourante.size());
					//Cle cle = new Cle(tree.getChild(i).getText());
					s.setDeplacement(getDeplacement(s));
					tdsCourante.put(tree.getChild(i).getText(), s);
				}
				createdInFunction = false;
			}
			else if(createdInFunctionAsParameter){ //cas du parametre
				for (int i = 1; i < tree.getChildCount(); i++) {
					Symbole s = new Symbole(tree.getChild(i).getText(),tree.getChild(0).getText(),"parametre" , tdsCourante.size());
					s.setDeplacement(getDeplacement(s));
					tdsCourante.put(tree.getChild(i).getText(), s);
				}
				createdInFunctionAsParameter = false;

			}
			else{
				for (int i = 1; i < tree.getChildCount(); i++) { // cas d'une variable
					Symbole  s = new Symbole(tree.getChild(i).getText(),tree.getChild(0).getText(), "variable",tdsCourante.size());
					//Cle cle = new Cle(tree.getChild(i).getText());
					s.setDeplacement(getDeplacement(s));
					tdsCourante.put(tree.getChild(i).getText(), s);
				}
			}
		}

	}

	private int getDeplacement(Symbole symboleAppelant) {
		int depParam = 0;
		int depOther = 0;
		Set<Map.Entry<String, Symbole>> mapSet = tdsCourante.entrySet();
		Iterator<Map.Entry<String, Symbole>> ite = mapSet.iterator();
		if(mapSet.size()==0) {
			return 0;
		}
		else {
			while(ite.hasNext()) {
				Symbole s = ite.next().getValue();
				if(s.getSortieType().equals("parametre")&&symboleAppelant.getSortieType().equals("parametre")) {
					s.setDeplacement(s.getDeplacement()-symboleAppelant.getTaille());
					//depParam = depParam - s.getTaille();
				}
				else if(!(s.getSortieType().equals("parametre")||symboleAppelant.getSortieType().equals("parametre"))){
					depOther = depOther + s.getTaille();
				}
			}
			if(symboleAppelant.getSortieType().equals("parametre")) {
				return symboleAppelant.getDeplacement();
			}
			else {
				return depOther;
			}
		}
	}
}
