package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;

import tds.TDS;


public class Main {

	private static int printAST  = 0;
	private static int printTDS  = 0;
	private static ArrayList<String> files;

	private static Tree ast;
	private static TDS mainTDS;
	private static CodeGenerator asm;

	public static void main(String[] args) throws Exception{
		int startFiles = 0; files = new ArrayList<String>();
		if(args.length > 1) {
			try {
				printAST =  Integer.parseInt(args[0]);
				printTDS = Integer.parseInt(args[1]);
				startFiles = 1;
			} catch(NumberFormatException e) {
				printAST = 0; 
				printTDS  = 0;
			}
		}

		files.add(args[2]);


		if(files.isEmpty()) {
		} else {
			for(int i=0; i<files.size(); i++) {
				try {
					File file = new File(files.get(i));
					System.out.print("Fichier \"" + files.get(i) + "\" : ");
					FileInputStream fis = new FileInputStream(file);
					System.out.println(" "); //ça c'est juste pour l'esthétique à l'affichage x)
					analyse(new ANTLRInputStream(fis), args[2]);
				} catch(IOException ioe) {
					System.out.println("Impossible de charger le fichier");
				}
			}
		}
	}

	public static void analyse(ANTLRInputStream antlrInputStream, String path) throws RecognitionException {
		if(analyseSyntaxique(antlrInputStream)) {
			fillTDS fill = new fillTDS(ast, mainTDS);
			if(printTDS==1) {
				showTDS(fill.mainTDS);
			}
			//analyseSemantique();
			genererASM(mainTDS,path);
		}
	}



	private static void genererASM(TDS tds, String fileName) {
		
		asm = new CodeGenerator(ast, tds, fileName);
		asm.start();
	}

	private static void showTDS(TDS tds) {
		
		System.out.println(tds);
	}

	public static boolean analyseSyntaxique(ANTLRInputStream antlrInputStream) throws RecognitionException {

		grammarA60Lexer lexer = new grammarA60Lexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		grammarA60Parser parser = new grammarA60Parser(tokens);
		String syntaxError = "";
		ast = (CommonTree)parser.program().getTree();
		mainTDS = new TDS(0);
		TDS.nbRegion = 0;
		if(syntaxError.equals("")) {
			if(printAST == 1) showAST();
		} else {
			System.out.println(syntaxError);
		}
		
		return syntaxError.equals("");
	}
	
	public static void showAST() {
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(ast);
		System.out.println("\n\nAST :\n\n" + st);
	}
	
	public static boolean analyseSemantique() {
		newAnalyseur semantic = new newAnalyseur(ast, mainTDS);
		semantic.analyser();
		return false;
	}
}
