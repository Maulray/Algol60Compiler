package tds;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class Symbole {
	private String nom;
	private String type;
	private String sortie;
	private int borneInf;
	private int borneSup;
	private int dimension;
	private int nbparam;
	private int taille;
	private int deplacement;
	private int num;
	private ArrayList<Tree> parameterList;
	
	public Symbole(String nom, String type, String sortie, int num) {
		this.nom = nom;
		this.type = type;
		this.sortie = sortie;
		switch (type) {
			case "real":
				this.taille =4;
				break;
			case "integer":
			case "boolean":
				this.taille =2;
				break;
		}
		this.num = num;
	}

	public Symbole(String nom, String type, int borneInf, int borneSup, int dimension) {
		this.nom = nom;
		this.type = type;
		this.sortie ="tableau";
		this.borneInf = borneInf;
		this.borneSup = borneSup;
		this.dimension = dimension;

	}

	public Symbole(String nom, String sortie, int nbparam, ArrayList<Tree> parameterList) {
		this.nom=nom;
		this.sortie=sortie;
		this.nbparam=nbparam;
		this.parameterList = parameterList;
		this.type="procedure";
	}

	public String getNom() {return nom;}
	public int getNbPamram() {return nbparam;}
	public int getBorneInf() {return borneInf;}
	public int getBorneSup() { return borneSup;}
	public int getNbparam() {return nbparam;}
	public String getType() {return type;}
	public String getSortieType(){return sortie;}
	public int getDeplacement() {return deplacement;}
	public void setDeplacement(int deplacement) {this.deplacement = deplacement;}
	public int getNum() {return num;}
	public int getTaille() {return taille;}

	@Override
	public String toString() {
		if(sortie.equals("variable") || sortie.equals("iterateur") || sortie.equals("parametre")) {
		return "Symbole [nom=" + nom + ", typeElement=" + sortie +", type=" + type + ", taille=" + taille + ", deplacement : " + deplacement +"]\n" ;
		}
		else if(sortie.equals("tableau")) {
			return "Symbole [nom=" + nom + ", typeElement=" + sortie  +", type=" + type + ", borneInf=" + borneInf + ", borneSup=" + borneSup + ", dimension=" + dimension + "]\n";
		}
		else {//if(typeElement.equals("void")) {
			return "Symbole [nom=" + nom + ", typeElement=" + type +", typeSortie=" + sortie + ", nombre de param�tres=" + nbparam + ", parametres = " + parameterList.toString() +"]\n";
		}
	}




	
}
