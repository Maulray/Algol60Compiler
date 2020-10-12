package main;

//Convention : R0 base pointer, W15 stack pointer, WR registre de travail

import org.antlr.runtime.tree.Tree;
import tds.Symbole;
import tds.TDS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class CodeGenerator {

    private Tree ast;
    private TDS tdsCourante;

    private String fileName;
    private FileWriter fileWriter;

    private int NumReg;
    private int NumBloc;
    private int NumSuite;
    private int NumVrai;
    private int NumFaux;
    private int NumAlors;
    private int NumSinon;
    private int NumFor;
    private int NumLoop;
    private int NumFinLoop;
    private int NumSuiteFor;
    private int NumSuiteProc;
    private int NumSuiteIF;
    private int NumPrint;

    public CodeGenerator(Tree tree, TDS tableGenerale, String fileName) {
        this.ast = tree;
        this.tdsCourante = tableGenerale;
        this.fileName = fileName.split("\\.a60")[0];
        this.NumReg = 0;
        this.NumBloc = 0;
        this.NumSuite = 0;
        this.NumVrai = 0;
        this.NumFaux = 0;
        this.NumAlors = 0;
        this.NumSinon = 0;
        this.NumFor = 0;
        this.NumLoop = 0;
        this.NumFinLoop = 0;
        this.NumSuiteFor = 0;
        this.NumSuiteProc = 0;
        this.NumSuiteIF = 0;
        this.NumPrint = 0;
    }


    public void start() {
        try {
            File file = new File(fileName + ".src");      //Format attendu pour le code assembleur
            fileWriter = new FileWriter(file);
            this.initFile();
            this.genereExp(ast);
            this.endFile();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void initFile() throws IOException {
        this.fileWriter.write(
                //à voir si on a besoin de trucs en plus
                "sp EQU R15\n" +
                        "bp EQU R0\n" +
                        "wr EQU R1\n" +
                        "SP EQU R15\n" +
                        "BP EQU R0\n" +
                        "WR EQU R1\n" +
                        "STACK_ADRS EQU 0x1000\n" +
                        "LOAD_ADRS EQU 0x2000\n" + //à voir où on veut la mettre
                        "EXIT_EXC EQU 64\n" +
                        "WRITE_EXC EQU 66\n" +
                        "ORG LOAD_ADRS\n" + //origine = adresse de chargement
                        "START debut\n" +
                        "\n" +
                        "debut LDW SP, #STACK_ADRS\n" +
                        "LDQ 0, BP\n"
        );
    }

    private void endFile() throws IOException {
        this.fileWriter.write(
                "END_ADRS string \"|\"\n"+
                        "LDW BP, #END_ADRS\n" +
                        "LDW WR, #WRITE_EXC\n" +
                        "TRP WR\n"+
                        "TRP #EXIT_EXC\n" + //arrête le programme
                        "JEA @debut\n" +// nécessaire sur le simulateur sinon le programme ne s'arrête pas
                        "\n\n\n\n"
        );
        genereITOA();

    }


    public void genereExp(Tree exp) throws IOException {
        switch (exp.getText()) {
            case "PARAM_LIST":
            case "ARRAYSEG":
            case "BORNES":
            case "FOR_LIST":
            case "DEFINITION":
            case "VP":
            case "goto":
            case "go to":
                //TODO (il faut d'abord vérifier s'ils ont une utilité dans la partie gen de code où s'ils servaient juste pour les CS et la TDS)
                break;
            case "FOR_LIST_ELEM": //pas besoin on y accède depuis for
            case "PROCH": //pas besoin on y accède depuis procedure_statement
            case "PARAMETRES": //pas besoin on y accède depuis procedure_statement

                break;
            case "TAIL":
                for (int i = 0; i < exp.getChildCount(); i++) {
                    genereExp(exp.getChild(i));
                }
                if (!((exp.getParent().getText().equals("ALORS")) || (exp.getParent().getText().equals("SINON")) || exp.getParent().getText().equals("FOR_STATEMENT"))) {
                    genereSortieBloc();
                }
                break;
            case "TYPARPROCDEC":
                if (exp.getChild(1).getText() == "PROCEDURE_STATEMENT") {
                    genereProc(exp.getChild(1));
                }
                break;
            case "STATEMENT_BIS":
                if (exp.getChild(1).getText().equals("UNLABELLED_BLOCK")) {
                    genereExp(exp.getChild(1));
                } else {
                    genereEntrerBloc(exp);
                }
                break;
            case "UNLABELLED_BLOCK":
                genereEntrerBloc(exp);
                break;
            case "PROCEDURE_STATEMENT":
                //Normalement on arrivera jamais dessus par ici puisqu'il est lancé à partir de TYPARPROCDEC
                break;
            case "**":
                //Yann m'a dit que c'est vraiment ultra complexe à gérer en ASM du coup bon
                break;
            case "CONDITION":
                genereCondition(exp);
                break;
            case "ACTION":
                genereAction(exp);
                break;
            case "FOR_STATEMENT":
                genereForstatement(exp);
                break;
            case "FOR_CONDITION":
                genereForCondition(exp);
                break;
            case "STEP":
            case "UNTIL":
                //genereStepUntil(exp);
                break;
            case "IF":
            case "IF_STATEMENT":
                genereIf(exp);
                break;
            case "SINON":
            case "ALORS":
                genereSinonAlors(exp);
                break;
            case "&":
            case "|":
                genereOplogic(exp);
                break;
            case "<":
            case "<=":
            case ">":
            case ">=":
            case "<>":
            case "=":
                genereComparateur(exp);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                genereOperateurArith(exp);
                break;
            default:
                genereIdf(exp, false, true); //à revoir je suis pas totalement sûre de comment ça marche
                break;
        }
    }


    private void genereEntrerBloc(Tree exp) throws IOException { //cf page 7 code_gen2_complement.pdf
        if (NumBloc != 0) {
            for (Integer i : tdsCourante.getFils().keySet()) {
                tdsCourante = tdsCourante.getFils().get(i);
            }
        }
        this.NumBloc++;
        this.NumReg++;
        int taille_locale = 0;
        for (String key : tdsCourante.keySet()) {
            Symbole s = tdsCourante.get(key);
            String type = s.getSortieType();
            if (type.equals("variable") || type.equals("iterateur")) {
                taille_locale += s.getTaille();
            }
        }
        this.fileWriter.write(
                "LDQ " + taille_locale + ", R14\n" + //On charge R14 avec la taille des données locales pour le bloc
                        "ADQ -2, SP\n" +
                        "STW BP, (SP)\n" + //empile le contenu de BP
                        "LDW BP, SP\n" + // charge le contenu de SP dans BP qui pointe sur sa sauvegarde
                        "SUB SP, R14, SP\n" // réserve R14 octets sur la pile pour les variables locales
        );
        for (int i = 0; i < exp.getChildCount(); i++) {
            genereExp(exp.getChild(i));
        }
    }

    private void genereSortieBloc() throws IOException {
        tdsCourante = tdsCourante.getPere();
        this.NumBloc--;
        this.fileWriter.write(
                "LDW SP, BP\n" + //charge SP avec BP -> abandon des infos locales
                        "LDW BP, (SP)\n" + //charge BP avec l'ancien BP
                        "ADQ 2, SP\n" //ancien BP supprimé de la pile
        );
    }

    private void genereProc(Tree exp) throws IOException {
        NumSuiteProc++;
        int nb_param = exp.getChild(0).getChild(1).getChildCount();
        this.fileWriter.write(
                "JMP #SUITEPROC" + NumSuiteProc + "-$-2\n" +
                        "PROC" + exp.getChild(0).getChild(0).getText() + " "
        );
        //Les variables locales seront "empilées" lors de l'appel genereExp, puisqu'on arrive sur un Unlabelled_block
        //La zone de liaison est faite grâce à l'entrée dans un bloc normalement (à vérifier)
        genereExp(exp.getChild(1));
        //TODO -> est-ce que le résultat se range toujours dans WR? Pour l'instant ça a l'air
        this.fileWriter.write(
                // on retourne au programme appelant
                "RTS\n" +
                        "SUITEPROC" + NumSuiteProc + " "
        );
    }

    private void genereForCondition(Tree exp) throws IOException {
        String borneinf = exp.getChild(1).getChild(0).getText();
        this.fileWriter.write(
                "LDW WR, #" + borneinf + "\n"
        );
        genereIdf(exp.getChild(0), true, false);
    }


    private void genereForstatement(Tree exp) throws IOException {
        NumFor++;
        NumLoop++;
        NumFinLoop++;
        NumSuiteFor++;
        genereForCondition(exp.getChild(0));
        this.fileWriter.write(
                "LDW R11, WR\n"
        );
        genereIdf(exp.getChild(0).getChild(1).getChild(1).getChild(0), false, false);
        this.fileWriter.write(
                "LDW R13, WR\n"
        );
        genereIdf(exp.getChild(0).getChild(1).getChild(2).getChild(0), false, false);
        this.fileWriter.write(
                "LDW R12, WR\n"
                        + "FOR" + NumFor + " CMP R11, R12\n"
                        + "JBL #LOOP" + NumLoop + "-$-2\n"
                        + "JMP #SUITEFOR" + NumSuiteFor + "-$-2\n"
                        + "LOOP" + NumLoop + " "
        );
        genereExp(exp.getChild(1));
        this.fileWriter.write(
                "ADD R11, R13, R11\n"
                        + "LDW WR, R11\n"
        );
        genereIdf(exp.getChild(0).getChild(0), true, false);
        this.fileWriter.write(
                "JMP #FOR" + NumFor + "-$-2\n"
                        + "SUITEFOR" + NumSuiteFor + " CMP R11, R12\n" //Pour le dernier tour de boucle
                        + "JNE #FINLOOP" + NumFinLoop + "-$-2\n"
        );
        genereExp(exp.getChild(1));
        this.fileWriter.write(
                "FINLOOP" + NumFinLoop + " "
        );
    }


    private void genereCondition(Tree exp) throws IOException { //DONE
        genereComparateur(exp.getChild(0));//Je considère qu'il y a qu'une condition (et pas une suite logique de conditions) pour le moment, on verra plus tard si on a le temps de complexifier
    }


    private void genereAction(Tree exp) throws IOException { //DONE
        //Il faudra différencier pour les fonctions predef genre outstring etc, parce que ça passe dans des ACTION
        if (exp.getChild(0).getText().equals("outinteger")) {
            NumPrint++;
            this.fileWriter.write(
                    "ADQ -8, SP\n" +
                            "LDW WR, #10\n"+
                            "STW WR, -(SP)\n"+
                            "LDW WR, SP\n"+
                            "ADQ 8, WR\n"+
                            "STW WR, -(SP)\n"
            );
            genereIdf(exp.getChild(1).getChild(1), false, false);
            this.fileWriter.write(
                    "STW WR, -(SP)\n"+
                            "JSR @itoa_\n"+
                            "ADQ 6, SP\n"
            );
            this.fileWriter.write(
                    "MSG_ADRS"+NumPrint+" string \"| " + exp.getChild(1).getChild(1).getText() + " : \"\n" +
                            "LDW R2, BP\n" +
                            "LDW BP, #MSG_ADRS"+NumPrint+"\n" +
                            "LDW WR, #WRITE_EXC\n" +
                            "TRP WR\n"+
                            "LDW BP, R5\n"+
                            "LDW WR, #WRITE_EXC\n" +
                            "TRP WR\n" +
                            "SPACE_ADRS"+NumPrint+" string \" \"\n"+
                            "LDW BP, #SPACE_ADRS"+NumPrint+"\n" +
                            "LDW WR, #WRITE_EXC\n" +
                            "TRP WR\n"+
                            "LDW BP, R2\n"
            );
        } else {
            genereExp(exp.getChild(1));
            genereIdf(exp.getChild(0), true, false);
        }
    }


    private void genereIf(Tree exp) throws IOException { //DONE
        genereCondition(exp.getChild(0));//Je considère qu'il y a qu'une condition (et pas une suite logique de conditions) pour le moment, on verra plus tard si on a le temps de complexifier
        if (exp.getChildCount() == 3) {
            NumAlors++;//c'est toujours incrémenté peu importe dans lequel on passe mais ça évite de vérifier des trucs alors que c'est inutile
            NumSinon++;//c'est toujours incrémenté peu importe dans lequel on passe mais ça évite de vérifier des trucs alors que c'est inutile
            NumSuiteIF++;
            this.fileWriter.write(
                    "LDW R2, #1\n" +
                            "CMP WR, R2\n" +
                            "JEQ #ALORS" + NumAlors + "-$-2\n" +//Si le résultat du comparateur -> la comparaison est vraie -> on rentre dans le ALORS
                            "JMP #SINON" + NumSinon + "-$-2\n" +//Sinon on rentre dans le SINON
                            "ALORS" + NumAlors + " ");
            int temp1 = NumAlors;
            int temp2 = NumSinon;
            int temp3 = NumSuiteIF;
            genereSinonAlors(exp.getChild(1)); //renvoie void mais écrit dans le fichier
            NumAlors = temp1;
            NumSinon = temp2;
            NumSuiteIF = temp3;
            this.fileWriter.write(
                    "JMP #SUITEIF" + NumSuiteIF + "-$-2\n" +
                            "SINON" + NumSinon + " "
            );
            genereSinonAlors(exp.getChild(2));
            NumAlors = temp1;
            NumSinon = temp2;
            NumSuiteIF = temp3;
            this.fileWriter.write(
                    "SUITEIF" + NumSuiteIF + " "
            );
        } else {
            NumSuiteIF++;
            this.fileWriter.write(
                    "LDW R2, #1\n" +
                            "CMP WR, R2\n" +
                            "JNE #SUITEIF" + NumSuiteIF + "-$-2\n"
            );
            int temp = NumSuiteIF;
            genereSinonAlors(exp.getChild(1));
            NumSuiteIF = temp;
            this.fileWriter.write(
                    "SUITEIF" + NumSuiteIF + "\n "
            );
        }

    }


    private void genereSinonAlors(Tree exp) throws IOException { //DONE
        genereExp(exp.getChild(0));//Je pense qu'il y a pas besoin de plus? A voir pendant la phase de test
    }


    private void genereComparateur(Tree exp) throws IOException { //DONE
        String comp = "";
        NumVrai++; //c'est toujours incrémenté peu importe dans lequel on passe mais ça évite de vérifier des trucs alors que c'est inutile
        NumFaux++;//c'est toujours incrémenté peu importe dans lequel on passe mais ça évite de vérifier des trucs alors que c'est inutile
        switch (exp.getText()) {
            case "<":
                comp = "JLW";
                break;
            case "<=":
                comp = "JLE";
                break;
            case ">":
                comp = "JGT";
                break;
            case ">=":
                comp = "JGE";
                break;
            case "=":
                comp = "JEQ";
                break;
            case "<>":
                comp = "JNE";
                break;
        }
        genereExp(exp.getChild(0));
        this.fileWriter.write(
                "STW WR, R2\n" //Empilement de la partie gauche
        );
        genereExp(exp.getChild(1));
        this.fileWriter.write(
                "LDW R3, #0\n" +
                        "CMP R2, WR\n" +
                        comp + " #VRAI" + NumVrai + "-$-2\n" + //Si la comparaison est vraie alors on rentre dans le VRAI
                        "JMP #FAUX" + NumFaux + "-$-2\n" +//Sinon on rentre dans le FAUX
                        "VRAI" + NumVrai + " LDW R3, #1\n" +//Si la comparaison est vraie alors on met 1 dans WR
                        "FAUX" + NumFaux + " LDW WR, R3\n"
        );
    }


    private void genereOperateurArith(Tree exp) throws IOException { //DONE
        String operator = "";
        switch (exp.getText()) {
            case "+":
                operator = "ADD";
                break;
            case "-":
                operator = "SUB";
                break;
            case "/":
                operator = "DIV";
                break;
            case "*":
                operator = "MUL";
                break;
        }
        genereExp(exp.getChild(0));
        NumSuite++; //On incrémente même si on a pas besoin de jump mais c'est pas très grave au pire
        this.fileWriter.write(
                "STW WR, R3\n" //Empilement de la partie gauche
        );
        genereExp(exp.getChild(1));
        NumSuite++;
        //Cas de la division par 0
        if (operator.equals("DIV")) {
            this.fileWriter.write(
                    "LDW R2, #0\n" +
                            "CMP WR, R2\n" +
                            "JNE #SUITE" + NumSuite + "-$-2\n" +
                            //Trouver comment afficher : "\033[31mERROR\033[0m : line "+exp.getLine()+" : division by 0.");
                            "LDQ EXIT_EXC, WR\nTRP WR\n"//Si l'élément de droite est différent de 0 cette instruction sera sautée
            );
        }
        this.fileWriter.write(
                "SUITE" + NumSuite + " " +operator + " R3, WR, WR\n"
        );
    }

    private void genereOplogic(Tree exp) throws IOException {
        NumSuite++;
        String Op = exp.getText();
        genereExp(exp.getChild(0));
        this.fileWriter.write(
                "STW WR, -(SP)\n" //Empilement de la partie gauche
        );
        genereExp(exp.getChild(1));
        this.fileWriter.write(
                "LDW R2, (SP)+\n"
        );
        //A ce stade on a dans R1(WR) et R2 les booléens des parties gauche et droite de l'expression (1 si vrai, 0 si faux)
        switch (Op) {
            case "|":
                this.fileWriter.write(
                        "LDW R3, #1\n" +
                                "CMP WR, R3\n" +
                                "JEQ #SUITE" + NumSuite + "-$-2\n" +
                                "CMP R2, R3\n" +
                                "JEQ #SUITE" + NumSuite + "-$-2\n" +
                                "LDW R3, #0\n" +
                                "SUITE" + NumSuite + " LDW WR, R3\n"
                );
                break;
            case "&":
                this.fileWriter.write(
                        "LDW R3, #0\n" +
                                "CMP WR, R3\n" +
                                "JEQ #SUITE" + NumSuite + "-$-2\n" +
                                "CMP R2, R3\n" +
                                "JEQ #SUITE" + NumSuite + "-$-2\n" +
                                "LDW R3, #1\n" +
                                "SUITE" + NumSuite + " LDW WR, R3\n"
                );
                break;
        }
    }


    private void genereIdf(Tree exp, Boolean save, Boolean run) throws IOException { //à revoir je suis pas totalement sûre de comment ça marche
        String idf = exp.getText();
        if (!(idf.matches("[a-zA-Z]+[a-zA-Z0-9]*"))) {
            this.fileWriter.write(
                    "LDW WR, #" + idf + "\n"
            );
        } else {
            TDS tds = tdsCourante.getTDS(idf); // fonction qui retrouve la TDS contenant l'idf en param�tre
            Symbole s = tds.get(idf); // on r�cup�re le symbole correSPondant � l'idf
            String type = s.getType();
            if (type.equals("procedure") && run) {
                if (exp.getChildCount() == 1) { //on empile les paramètres ici
                    for (int k = 0; k < exp.getChild(0).getChildCount(); k++) {
                        genereIdf(exp.getChild(0).getChild(k), false, true);//true comme ça, ça devrait fonctionner si un appel de fonction qui est passé en param
                        this.fileWriter.write(
                                "STW WR, -(SP)\n"
                        );
                    }
                }
                this.fileWriter.write(
                        "JSR @PROC" + s.getNom() + "\n"
                );
                if (exp.getChildCount() == 1) { //on désempile les paramètres ici
                    this.fileWriter.write(
                            "ADQ 2*" + exp.getChild(0).getChildCount() + ", SP\n"
                    );
                }
            } else {
                type = s.getSortieType(); // on r�cup�re le type de la variable
                int imbricationDeDecl = tds.numImbrication + 1;//faire une fonction qui permet, a partir de l'idf, de récupérer le numéro d'imbrication du bloc de déclaration
                int nbRemontees = NumBloc - imbricationDeDecl;
                this.fileWriter.write(
                        "LDW R14, BP\n"
                );
                if (type.equals("parametre")) {
                    while (nbRemontees > 1) { //remontée des chaînages statiques jusqu'à arriver dans le bloc de déclaration de l'idf
                        this.fileWriter.write(
                                "LDW BP, (BP)\n"
                        );
                        nbRemontees--;
                    }
                } else {
                    while (nbRemontees > 0) { //remontée des chaînages statiques jusqu'à arriver dans le bloc de déclaration de l'idf
                        this.fileWriter.write(
                                "LDW BP, (BP)\n"
                        );
                        nbRemontees--;
                    }
                }
                int deplacement = 0;
                if (type.equals("variable") || type.equals("iterateur")) {
                    deplacement = -2;
                } else {
                    deplacement = 4;
                }
                deplacement -= s.getDeplacement();
                if (save) {
                    this.fileWriter.write(
                            "STW WR, (BP)" + deplacement + "\n"
                    );
                } else {
                    this.fileWriter.write(
                            "LDW WR, (BP)" + deplacement + "\n" //charge idf dans WR
                    );
                }
                this.fileWriter.write(
                        "LDW BP, R14\n"
                );
            }
        }
    }

    private void genereITOA() throws IOException {
        this.fileWriter.write(
                "ITOA_I	equ 4	// offset du paramÃ¯Â¿Â½tre i\n" +
                        "ITOA_P	equ 6	// offset du paramÃ¯Â¿Â½tre p\n" +
                        "ITOA_B	equ 8	// offset du paramÃ¯Â¿Â½tre b\n" +
                        "\n" +
                        "ASCII_MINUS		equ 45	// code ASCII de -\n" +
                        "ASCII_PLUS		equ 43 	// code ASCII de +\n" +
                        "ASCII_SP		equ 32 	// code ASCII d'espace SP\n" +
                        "ASCII_0			equ 48	// code ASCII de zÃ¯Â¿Â½ro (les autres chiffres jusqu'Ã¯Â¿Â½ 9 suivent dans l'ordre)\n" +
                        "ASCII_A			equ 65 	// code ASCII de A (les autres lettres jusqu'Ã¯Â¿Â½ Z suivent dans l'ordre alphabÃ¯Â¿Â½tique)\n" +
                        "\n" +
                        "// LNK: crÃ¯Â¿Â½e environnement du main pour permettre des variables locales\n" +
                        "// mais sans encore les rÃ¯Â¿Â½server\n" +
                        "itoa_	stw bp, -(sp)\n" +
                        " 		ldw bp, sp\n" +
                        "\n" +
                        "// rÃ¯Â¿Â½cupÃ¯Â¿Â½ration des paramÃ¯Â¿Â½tres depuis pile vers registres\n" +
                        "		ldw r5, (bp)ITOA_I    // r0 = i\n" +
                        "		ldw r6, (bp)ITOA_B    // r1 = b\n" +
                        "\n" +
                        "// gÃ¯Â¿Â½re le signe: normalement itoa gÃ¯Â¿Â½re des int c'est Ã¯Â¿Â½ dire des entiers signÃ¯Â¿Â½s,\n" +
                        "// mais en fait seulement pour b=10;\n" +
                        "// dans ce cas calcule le signe dans r3 et charge r0 avec la valeur absolue de i\n" +
                        " 		ldq ASCII_SP, r3		// code ASCII de espace (SPace) -> r3\n" +
                        "		ldq 10, wr			// 10 -> wr\n" +
                        "		cmp r6, wr			// charge les indicateurs de b - 10\n" +
                        "		bne NOSIGN-$-2		// si non Ã¯Â¿Â½gal (donc si b != 10) saute en NOSIGN, sinon calcule signe\n" +
                        "		ldq ASCII_PLUS, r3	// charge le code ASCII du signe plus + dans r3\n" +
                        "		tst r5				// charge les indicateurs de r0 et donc de i\n" +
                        "		bge POSIT-$-2		// saute en POSIT si i >= 0\n" +
                        "		neg r5, r5			// change le signe de r0\n" +
                        "		ldq ASCII_MINUS, r3	// charge le code ASCII du signe moins - dans r3\n" +
                        "POSIT	NOP					// r3 = code ASCII de signe: SP pour aucun, - ou +\n" +
                        "\n" +
                        "\n" +
                        "// convertit l'entier i en chiffres et les empile de droite Ã¯Â¿Â½ gauche\n" +
                        "NOSIGN		ldw r2, r5	// r2 <- r0\n" +
                        "CNVLOOP		ldw r5, r2 	// r0 <- r2\n" +
                        "\n" +
                        "	// effectue \"crÃ¯Â¿Â½ativement\" la division par b supposÃ¯Â¿Â½ pair (car l'instruction div est hÃ¯Â¿Â½las signÃ¯Â¿Â½e ...)\n" +
                        "	// d=2*d' , D = d * q + r  , D = 2*D'+r\" , D' = d' * q + r' => r = 2*r'+r\"\n" +
                        "	// un bug apparaÃ¯Â¿Â½t avec SRL R0, R0 avec R0 = 2 : met CF Ã¯Â¿Â½ 1 !!\n" +
                        "		srl r6, r6			// r1 = b/2\n" +
                        "		ani r5, r4, #1		// ANd ImmÃ¯Â¿Â½diate entre r0 et 00...01 vers r4:\n" +
                        "							// bit nÃ¯Â¿Â½0 de r0 -> r4; r4 = reste\" de r0/2\n" +
                        "		srl r5, r5			// r0 / 2 -> r0\n" +
                        "		div r5, r6, r2		// quotient = r0 / r1 -> r2, reste' = r0 % r1 -> r0\n" +
                        "		shl r5, r5			// r0 = 2 * reste'\n" +
                        "		add r5, r4, r5		// r0 = reste = 2 * reste' + reste\" => r0 = chiffre\n" +
                        "		shl r6, r6			// r1 = b\n" +
                        "\n" +
                        "		adq -10, r5			// chiffre - 10 -> r0\n" +
                        "		bge LETTER-$-2		// saute en LETTER si chiffre >= 10\n" +
                        "		adq 10+ASCII_0, r5	// ajoute 10 => r0 = chiffre, ajoute code ASCII de 0\n" +
                        "							// => r0 = code ASCII de chiffre\n" +
                        "		bmp STKCHR-$-2		// saute en STKCHR\n" +
                        "\n" +
                        "LETTER	adq ASCII_A, r5		// r0 = ASCII(A) pour chiffre = 10, ASCII(B) pour 11 ...\n" +
                        "							// ajoute code ASCII de A => r = code ASCII de chiffre\n" +
                        "STKCHR	stw r5, -(sp)		// empile code ASCII du chiffre\n" +
                        "							// (sur un mot complet pour pas dÃ¯Â¿Â½saligner pile)\n" +
                        "		tst r2				// charge les indicateurs en fonction du quotient ds r2)\n" +
                        "		bne CNVLOOP-$-2		// boucle si quotient non nul; sinon sort\n" +
                        "\n" +
                        "// les caractÃ¯Â¿Â½res sont maintenant empilÃ¯Â¿Â½s : gauche en haut et droit en bas\n" +
                        "\n" +
                        "// recopie les caractÃ¯Â¿Â½res dans le tampon dans le bon ordre: de gauche Ã¯Â¿Â½ droite\n" +
                        "		ldw r6, (bp)ITOA_P	// r1 pointe sur le dÃ¯Â¿Â½but du tampon dÃ¯Â¿Â½jÃ¯Â¿Â½ allouÃ¯Â¿Â½\n" +
                        "		LDW r4, #ASCII_PLUS	// N'affiche pas le signe +\n" +
                        "		CMP R3, r4			// N'affiche pas le signe +\n" +
                        "		BEQ CPYLOOP-$-2		// N'affiche pas le signe +\n" +
                        "		stb r3, (r6)+		// copie le signe dans le tampon\n" +
                        "CPYLOOP ldw r5, (sp)+		// dÃ¯Â¿Â½pile code du chiffre gauche (sur un mot) dans r0\n" +
                        "		stb r5, (r6)+		// copie code du chiffre dans un Byte du tampon de gauche Ã¯Â¿Â½ droite\n" +
                        "		cmp sp, bp			// compare sp et sa valeur avant empilement des caractÃ¯Â¿Â½res qui Ã¯Â¿Â½tait bp\n" +
                        "		bne CPYLOOP-$-2		// boucle s'il reste au moins un chiffre sur la pile\n" +
                        "		ldq 0, r5			// charge le code du caractÃ¯Â¿Â½re NUL dans r0\n" +
                        "		stb r5, (r6)+		// sauve code NUL pour terminer la chaÃ¯Â¿Â½ne de caractÃ¯Â¿Â½res\n" +
                        "\n" +
                        "// termine\n" +
                        "		ldw r5, (bp)ITOA_P	// retourne le pointeur sur la chaÃ¯Â¿Â½ne de caractÃ¯Â¿Â½res\n" +
                        "\n" +
                        "	// UNLINK: fermeture de l'environnement de la fonction itoa\n" +
                        "		ldw sp, bp			// sp <- bp : abandonne infos locales; sp pointe sur ancinne valeur de bp\n" +
                        "		ldw bp, (sp)+		// dÃ¯Â¿Â½pile ancienne valeur de bp dans bp; sp pointe sur adresse de retour\n" +
                        "\n" +
                        "		rts					// retourne au programme appelant\n" +
                        "\n"
        );
    }
}