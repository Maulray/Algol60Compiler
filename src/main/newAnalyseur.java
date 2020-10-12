package main;

import org.antlr.runtime.tree.Tree;


import tds.Symbole;
import tds.TDS;


import java.util.Set;

public class newAnalyseur {

    private int numBloc;
    private Tree ast;
    private TDS tdsCourante;

    public newAnalyseur(Tree ast, TDS tableGenerale) {
        this.ast = ast;
        this.tdsCourante = tableGenerale;
        this.numBloc = 1;
    }

    public void analyser() {
        Tree exp = ast;
        analyseExp(exp);
        //tdsCourante.genererDeplacement();
    }


    public String analyseExp(Tree exp) {
        switch (exp.getText()) {
            case "PARAM_LIST":
                return analyseParamList(exp);
            case "ARRAYSEG":
                return analyseArraySeg(exp);
            case "BORNES":
                return analyseBornes(exp);
            //chaque fils est une expression
            case "TAIL":
                return analyseTail(exp);
            case "CONDITION":
                return analyseCondition(exp);
            // on arrive sur un symbole de comparaison (<,=...) avec les experssions de chaque cÃ´tÃ© + appel des fonctions qui vont pour vÃ©rifier de chaque cÃ´tÃ©
            case "IF_STATEMENT":
                return analyseIfstatement(exp);
            // un condition, un alors et un sinon
            case "FOR_CONDITION":
                return analyseForcondition(exp);
            //un identificateur, un for-list-elem et un for-list
            case "FOR_LIST":
                return analyseForlist(exp);
            //regarder dans un cas ou il y a quelque chose derriÃ¨re parce que la je ne sais pas
            case "FOR_LIST_ELEM":
                return analyseForlistelem(exp);
            //on a le choix entre faire la fonction en deux parties en fonction de s'il y a une ou deux expressions derriÃ¨re la bool-expr
            // ou alors j'essaie de changer encore l'ast
            case "FOR_STATEMENT":
                return analyseForstatement(exp);
            // une for condition et un action
            case "STEP":
            case "UNTIL":
                return analyseStepUntil(exp);
            //je crois qu'ils ont le mÃªme type de fils, regarder ce qu ALGOL autorise en terme de types
            case "DEFINITION": //DONE
                return analyseDefinition(exp);
            case "PARAMETRES": //DONE
                return analyseParametres(exp);
            case "IF":
                return analyseIf(exp);
            // un condition, un alors et un sinon
            //case "IF_CLAUSE": plus utilisÃ© je crois, ou alors je ne l'ai pas trouvÃ©
            case "PROCEDURE_STATEMENT":
                return analyseProcedurestatement(exp);
            // thÃ©oriquement a comme fils un procÃ©dure heading et potentiellement un statment bis mais aucune idÃ©e de si c'est vraiment utile -> voir ou Ã§a apparaÃ®t
            case "PROCH":
                return analyseProch(exp);
            case "TYPARPROCDEC":
                return analyseTypParProcDec(exp);
            case "SINON":
            case "ALORS":
                return analyseSinonAlors(exp);
            //dans les deux cas doivent Ãªtre suivi par une action
            case "STATEMENT_BIS":
                analyseStatementBis(exp);
            case "ACTION":
                return analyseAction(exp);
            //probablement un truc Ã  faire mais Ã§a va Ãªtre du sale*/
            case "UNLABELLED_BLOCK":
                return analyseUnlabelledBlock(exp);
            //suivi de block_head compound_tail
            //ce contrÃ´le ne sert probablement Ã  rien en fait
            case "VP":
                return analyseVP(exp);
            //suivi d'identifieurs
            case "goto":
            case "go to":
                return analyseGoto(exp);
            //pas sÃ»re de la nÃ©cessitÃ© de celui la mais au moins pas oubliÃ©
            // suivi d'une expression
            case "OR":
            case "or":
            case "||":
            case "AND":
            case "and":
            case "&":
            case "&&":
            case "|":
                return analyseOplogic(exp);
            case "<":
            case "<=":
            case ">":
            case ">=":
            case "<>":
            case "=":
                return analyseComparateur(exp);
            case "+":
                return analysePlus(exp);
            case "-":
                return analyseMoins(exp);
            //Le plus ne peut pas Ãªtre analyser avec le moins car le moins est aussi utilisÃ© pour les nombres nÃ©gatifs
            case "*":
            case "/":
            case "%":
                return analyseOpmultiplicatif(exp);
            case "**":
                return analysePuissance(exp);
            //J'ai modifiÃ© la grammaire -> enracinement du ** (l 207 sinon je ne vois pas quand on prend en compte le passage Ã  la puissance dans l'ast)

            default:
                return analyseIdf(exp); //comme Ã§a si c'est un int ou un rÃ©el Ã§a dervait le renvoyer tel quel et si c'est un idf Ã§a irait le chercher dans la TDS?
        }
    }


    private String analyseStatementBis(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseDefinition(Tree def) {
        if (def.getChildCount() == 2) {
            if (!def.getChild(1).getText().matches("[a-zA-Z]+[a-zA-Z0-9]*")) {
                System.out.println("\033[31mERROR  \033[0m " + "line : " + def.getLine() + ", position : "+ def.getCharPositionInLine()+ " : "  + def.getChild(1).getText() + " paramater doesn't fit requirements : an alphanumeric string beginning with a letter is expected.");
            }
            //cr�er une �numeration des types possibles et verifier si l'enfant 0 appartient
            if (!def.getChild(1).getText().matches("[a-zA-Z]+[a-zA-Z0-9]*")) { //En fait c'est du syntaxique on s'en fiche
                System.out.println("\033[31mERROR  \033[0m : line "+ def.getLine() + ", position "+ def.getCharPositionInLine()+ " : " +def.getChild(1).getText() + " parameter doesn't fit requirements : an alphanumeric string beginning with a letter is expected.");
            }
        } else if (def.getChildCount() == 3) {
            //cr�er une �numeration des types possibles et verifier si l'enfant 0 appartient
            //cf cas pr�c�dent
            if (!def.getChild(2).getText().matches("[a-zA-Z]+[a-zA-Z0-9]*")) { //En fait c'est du syntaxique on s'en fiche
                System.out.println("\033[31mERROR\033[0m : line "+ def.getLine() + ", position "+ def.getCharPositionInLine()+ " : " + def.getChild(2).getText() + " parameter doesn't fit requirements : an alphanumeric string beginning with a letter is expected.");
            } else if (!def.getChild(2).getText().equals("array")) { //J'ai l'impression qu'un Array n'est jamais défini par là, mais toujours par TypArProcDec donc bon
                System.out.println("\033[31mERROR\033[0m : line "+ def.getLine() + ", position "+ def.getCharPositionInLine()+ " : " + def.getChild(3).getText() + " parameter has the wrong type, it should be an array but " + def.getChild(2).getText() + " found.");
            }

        } else {
            System.out.println("\033[31mERROR\033[0m : line "+ def.getLine() + ", position "+ def.getCharPositionInLine()+ " : There are too many types or variables for this affectation.");//irk je comprends pas exactement quand ça s'applique
        }
        return null; //est-ce qu'on a besoin de renvoyer le type du truc?
    }

    private String analyseStepUntil(Tree exp) {
        String typeP = analyseIdf(exp.getParent().getParent().getChild(0));
        String type = analyseIdf(exp.getChild(0));
        if ((typeP.equals("integer")&&!type.equals("integer"))) {
            System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Integer iterators must evolve among integers : " + exp.getChild(0) + "("+exp.getText()+ ") found.");
        }else if ((exp.getText().equals("STEP"))&&(analyseIdf(exp.getParent().getChild(0)).equals("integer"))&&(type.equals("integer"))&&(analyseIdf(exp.getParent().getChild(2).getChild(0)).equals("real")))
        {
            System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Integer iterators with integer steps must reach an integer : " + exp.getParent().getChild(2).getChild(0).getText() + " found.");
        }
        return type;
    }

    private String analyseForstatement(Tree exp) {

        String type = null;
        int nbChildren = exp.getChildCount();
        for (int i = 0; i < nbChildren; i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analysePuissance(Tree exp) {
        String result;
        String s1 = exp.getChild(0).getText();
        String s2 = exp.getChild(1).getText();
        String type1 = null;
        String type2 = null;
        switch (s1) {
            case "+":
                type1 = analysePlus(exp.getChild(0));
                break;
            case "-":
                type1 = analyseMoins(exp.getChild(0));
                break;
            case "*":
            case "/":
            case "%":
                type1 = analyseOpmultiplicatif(exp.getChild(0));
                break;
            case "**":
                type1 = analysePuissance(exp.getChild(0));
                break;
            default:
                type1 = analyseIdf(exp.getChild(0));
        }
        switch (s2) {
            case "+":
                type2 = analysePlus(exp.getChild(1));
                break;
            case "-":
                type2 = analyseMoins(exp.getChild(1));
                break;
            case "*":
            case "/":
            case "%":
                type2 = analyseOpmultiplicatif(exp.getChild(1));
                break;
            case "**":
                type2 = analysePuissance(exp.getChild(1));
                break;
            default:
                type2 = analyseIdf(exp.getChild(1));
        }

        if (type1.equals("boolean") || type2.equals("boolean")) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Booleans can't play any role in any raising to a power.");
            result = "boolean";
        }else if (type1.equals("real") || type2.equals("real")) {
            result = "real";
        } else {
            result = "integer";
        }
        return result;
    }

    public String analyseIdf(Tree idf) {
        String cle = idf.getText();
        if (cle.matches("-")){
            cle=idf.getChild(0).getText();
        }
        String type = null;
        if (cle.matches("[0-9]+")) {
            type = "integer";
        } else if (cle.matches("[0-9]+.[0-9]+")) {
            type = "real";
        } else if (cle.matches("true|false")) {
            type = "boolean";
        } else if(cle.matches("out.*")){
           type = "procedure";
        }else{
            Boolean isIn = false;
            TDS t = tdsCourante;
            while (!isIn && t.numImbrication >= 0) {
                isIn = t.containsKey(cle);
                if (isIn) {
                    type = t.get(cle).getType();
                } else if (t.numImbrication > 0) {
                    t = t.getPere();
                    System.out.println(t.numImbrication);
                } else {
                    System.out.println("\033[31mERROR\033[0m : line "+ idf.getLine() + ", position "+ idf.getCharPositionInLine()+ " : Identifier " + cle + " is not defined.");
                    type = "ND";
                    break;
                }
            }

        }
        return type;
    }

    private String analyseForlist(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseForlistelem(Tree exp) {
        String type = null;
        if (!analyseIdf(exp.getChild(0)).equals("integer")) {
            System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Iterators must be integer typed : " + exp.getChild(0).getText() + ".");
        }
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseIf(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseParametres(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }


    private String analyseProcedurestatement(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseComparateur(Tree exp) {
        String s1 = exp.getChild(0).getText();
        String s2 = exp.getChild(1).getText();
        String type2 = null;
        String type1 = null;


        if (exp.getChild(0).getText().matches("[0-9]+")) {
            type1 = "integer";
        } else if (exp.getChild(0).getText().matches("[0-9]+.[0-9]+]")) {
            type1 = "real";
        } else if (exp.getChild(0).getText().matches("true|false")) {
            type1 = "boolean";
        } else {
            type1 = analyseExp(exp.getChild(0));
        }
        if (exp.getChild(1).getText().matches("[0-9]+")) {
            type2 = "integer";
        } else if (exp.getChild(1).getText().matches("[0-9]+.[0-9]+]")) {
            type2 = "real";
        } else if (exp.getChild(1).getText().matches("true|false")) {
            type2 = "boolean";
        } else {
            type2 = analyseIdf(exp.getChild(1));
        }
        if (!exp.getText().equals("=") && (type1.equals("boolean") || type2.equals("boolean"))) {
            System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Impossible to apply '" + exp.getText() + "' between a boolean and anything else (boolean found : " + exp.getChild(0).getText() + ", " + type2 + " found :  " + exp.getChild(1).getText() + ").");
        } else if (exp.getText().equals("=") && !(type1.equals("boolean") && type2.equals("boolean"))) {
            if (type1.equals("boolean")) {
                System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Impossible to apply '=' between a boolean and another types (boolean found : " + exp.getChild(0).getText() + ", " + type2 + " found :  " + exp.getChild(1).getText() + ").");
            } else {
                System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Impossible to apply '=' between a boolean and another types (boolean found : " + exp.getChild(1).getText() + ", " + type2 + " found :  " + exp.getChild(0).getText() + ").");
            }
        }

        return "boolean";
    }

    public String analyseTypParProcDec(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            if (exp.getChild(i).getText().equals("ARRAYSEG")){
                type = analyseExp(exp.getChild(i));
            }
        }
        /*for (int j=1;j<exp.getChildCount();j++){
            Boolean isIn = false;
            int compteur = 0;

            String id = exp.getChild(j).getText();

            TDS t = tdsCourante;
            while(!isIn && t.numImbrication>=0){ //ébauche pour ne pas pouvoir redéclarer une variable déjà déclarée mais ça marche pas pour le moment
                isIn=t.containsKey(id);
                if (isIn&&t.numImbrication>0){
                    compteur+=1;
                    t=t.getPere();
                    isIn = false;
                }else if(t.numImbrication>0){
                    t=t.getPere();
                }else{
                    t.numImbrication=-1;
                }
                if (compteur>1) {
                    System.out.println("\033[31mERROR  \033[0m : line " + exp.getLine() + ", position " + exp.getCharPositionInLine() + " : " + id + " has already been declared.");
                }
            }
        }*/
        return type;
        //useless, les erreurs possibles auront été détectées avant.
    }

    public String analyseTail(Tree exp) {

        int nbChildren = exp.getChildCount();
        String t = null;
        for (int i = 0; i < nbChildren; i++) {
            t = analyseExp(exp.getChild(i));
        }
        return null;
    }

    private String analyseArraySeg(Tree exp) {
        String t = null;
        t = analyseExp(exp.getChild(1));
        return null;
    }

    private String analyseParamList(Tree exp) {
        int nbChildren = exp.getChildCount();
        String t = null;
        for (int i = 0; i < nbChildren; i++) {
            t = analyseExp(exp.getChild(i));
        }
        return "ND";
    }

    private String analyseCondition(Tree cond) {

        String type;
        switch (cond.getChild(0).getText()) {
            case "true":
            case "false":
                type = "boolean";
                break;
            default:
                type = analyseExp(cond.getChild(0));
        }
        return type;
    }

    private String analyseOplogic(Tree exp) {
        String s1 = exp.getChild(0).getText();
        String s2 = exp.getChild(1).getText();
        String type1 = analyseExp(exp.getChild(0));
        String type2 = analyseExp(exp.getChild(1));
        if (!(type1.equals("boolean") && type2.equals("boolean"))) {
            if (!type1.equals("boolean")) {
                System.out.println("\033[31mERROR\033[0m : line " + exp.getLine() + ", position " + exp.getCharPositionInLine() + " : '" + exp.getText() + "' operator can only be applied on booleans but "+ analyseIdf(exp.getChild(0))+" found for "+s1+".");
            }else{
                System.out.println("\033[31mERROR\033[0m : line " + exp.getLine() + ", position " + exp.getCharPositionInLine() + " : '" + exp.getText() + "' operator can only be applied on booleans but "+ analyseIdf(exp.getChild(1))+" found for "+s2+".");
            }
        }

        return "boolean";
    }

    private String analyseGoto(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseMoins(Tree exp) {
        String result = null;
        if (exp.getChildCount()==2) {
            String s1 = exp.getChild(0).getText();
            String type1 = null;
            String type2 = null;
            if (exp.getChild(0).getText().matches("[0-9]*")) {
                type1 = "integer";
            } else if (exp.getChild(0).getText().matches("[0-9]*.[0-9]*")) {
                type1 = "real";
            } else {
                switch (s1) {
                    case "+":
                        type1 = analysePlus(exp.getChild(0));
                        break;
                    case "-":
                        type1 = analyseMoins(exp.getChild(0));
                        break;
                    case "*":
                    case "/":
                    case "%":
                        type1 = analyseOpmultiplicatif(exp.getChild(0));
                        break;
                    case "**":
                        type1 = analysePuissance(exp.getChild(0));
                        break;
                    default:
                        type1 = analyseIdf(exp.getChild(0));
                }
            }
            if (exp.getChildCount() == 2) {
                String s2 = exp.getChild(1).getText();
                if (exp.getChild(1).getText().matches("[0-9]*")) {
                    type2 = "integer";
                } else if (exp.getChild(1).getText().matches("[0-9]*.[0-9]*")) {
                    type2 = "real";
                } else {
                    switch (s2) {
                        case "+":
                            type2 = analysePlus(exp.getChild(1));
                            break;
                        case "-":
                            type2 = analyseMoins(exp.getChild(1));
                            break;
                        case "*":
                        case "/":
                        case "%":
                            type2 = analyseOpmultiplicatif(exp.getChild(1));
                            break;
                        case "**":
                            type2 = analysePuissance(exp.getChild(1));
                            break;
                        default:
                            type2 = analyseIdf(exp.getChild(0));
                    }
                }
                if (type1.equals("boolean") || type2.equals("boolean")) {
                    System.out.println("\033[31mERROR\033[0m : line " + exp.getLine() + ", position " + exp.getCharPositionInLine() + " : " + "The opposite of a boolean doesn't exist.");
                    result = "boolean";
                } else if (type1.equals("real") || type2.equals("real")) {
                    result = "real";
                } else {
                    result = "integer";
                }
            }
        }else{
            result = analyseIdf(exp.getChild(0));
            if (result.equals("boolean")){
                System.out.println("\033[31mERROR\033[0m : line " + exp.getLine() + ", position " + exp.getCharPositionInLine() + " : " + "Booleans can't be substract.");
            }
        }
        return result;
    }

    private String analyseOpmultiplicatif(Tree exp) {
        String result;
        String s1 = exp.getChild(0).getText();
        String type1 = null;
        String type2 = null;
        Boolean DenNull = false;
        if (exp.getChild(0).getText().matches("[0-9]*")) {
            type1 = "integer";
        } else if (exp.getChild(0).getText().matches("[0-9]*.[0-9]*")) {
            type1 = "real";
        } else {
            switch (s1) {
                case "+":
                    type1 = analysePlus(exp.getChild(0));
                    break;
                case "-":
                    type1 = analyseMoins(exp.getChild(0));
                    break;
                case "*":
                case "/":
                case "%":
                    type1 = analyseOpmultiplicatif(exp.getChild(0));
                    break;
                case "**":
                    type1 = analysePuissance(exp.getChild(0));
                    break;
                default:
                    type1 = analyseIdf(exp.getChild(0));
            }
        }
        if (exp.getChildCount() == 2) {
            String s2 = exp.getChild(1).getText();
            if (s2.matches("[0-9]*")) {
                type2 = "integer";
                if (s2.matches("0")) {
                    DenNull = true;
                }
            } else if (exp.getChild(1).getText().matches("[0-9]*.[0-9]*")) {
                type2 = "real";
                if (s2.matches("[0]*.[0]*")) {
                    DenNull = true;
                }
            } else {
                switch (s2) {
                    case "+":
                        type2 = analysePlus(exp.getChild(1));
                        break;
                    case "-":
                        type2 = analyseMoins(exp.getChild(1));
                        break;
                    case "*":
                    case "/":
                    case "%":
                        type2 = analyseOpmultiplicatif(exp.getChild(1));
                        break;
                    case "**":
                        type2 = analysePuissance(exp.getChild(1));
                        break;
                    default:
                        type2 = analyseIdf(exp.getChild(1));
                }
            }
        }
        if (type1.equals("boolean") || type2.equals("boolean")) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Booleans are not fitted for multiplicative operations.");
            result = "boolean";
        }else if  (DenNull && exp.getText().equals("/")){
            System.out.println("\033[31mERROR\033[0m : line "+ exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : Explicit division by 0.");
            result = "real";
        } else if (type1.equals("integer") && type2.equals("integer") && (exp.getText().equals("*"))) {
            result = "integer";
        } else if (exp.getText() == "%") {
            result = "integer";
        } else if (type1.equals("real") || type2.equals("real")){
            result = "real";
        } else {
            result = "real"; //en soit ça dépend de si les trucs qu'on divise/qu'on modulo sont multiples l'un de l'autre mais vu que c'est à l'exec que ça se vérifie je sais pas trop comment faire...
        }
        return result;

    }

    public String analyseUnlabelledBlock(Tree exp) {

        int nbChildren = exp.getChildCount();
        String t = null;
        for (int i = 0; i < nbChildren; i++) {
            t = analyseExp(exp.getChild(i));
        }
        return null;
    }

    private String analyseAction(Tree act) { //TODO
        int nbChildren = act.getChildCount();

        if (nbChildren == 2) {
            String type = analyseIdf(act.getChild(0));
            String type2 = analyseExp(act.getChild(1));
            if (type2.equals("procedure")) {

                String cle = act.getChild(1).getText();
                Boolean isIn = false;
                TDS t = tdsCourante;
                while (!isIn && t.numImbrication >= 0) {
                    isIn = t.containsKey(cle);

                    if (isIn) {
                        type = t.get(cle).getType();
                    }
                    int nbParam = t.get(cle).getNbPamram();
                    if (!(nbParam == act.getChild(1).getChild(0).getChildCount())) {
                        System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + act.getChild(1).getText() + " procedure is called with a false number of arguments ("+nbParam+" expected).");
                    }
                }
            } else {
                switch (type) {
                    case "integer":
                        if (!type.equals(type2) && !act.getChild(1).getText().matches("[0-9]+")) {
                            System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected, " + type2 + " found for idf " + act.getChild(0).getText() + ".");// + act.getChild(1).getText() utile?
                        }
                        break;
                    case "real":
                        if (!type.equals(type2) && !type2.equals("integer") && !act.getChild(1).getText().matches("[0-9]+.[0-9]+")) {
                            System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + act.getChild(0).getText() + " variable is typed real and not : " + analyseExp(act.getChild(1)) + ".");
                        }
                        break;
                    case "boolean":
                        if (!type.equals(type2) && !act.getChild(1).getText().matches("true|false")&&!analyseExp(act.getChild(1)).equals("ND")) {
                            System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + act.getChild(0).getText() + " variable is typed boolean and not : " + analyseExp(act.getChild(1))+".");
                        }
                        break;
                    case "procedure":
                        break;
                    default: //ça doit être géré par l'analyse syntaxique ça aussi
                        System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " is not recognized.");
                }
            }
        } else if (nbChildren > 2) {
            String cle = act.getChild(0).getText();
            Boolean isIn = false;
            TDS t = tdsCourante;
            int borneInf;
            int borneSup;
            while (!isIn && t.numImbrication >= 0) {
                isIn = t.containsKey(cle);
                if (isIn) {
                    String type = t.get(cle).getType();
                    borneInf = t.get(cle).getBorneInf();
                    borneSup = t.get(cle).getBorneSup();
                    if (act.getChild(1).getText().matches("[0-9]+") && Integer.parseInt(act.getChild(1).getText()) < borneInf) {
                        System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + "Index " + act.getChild(1).getText() + " is inferior to the lower boundary " + borneInf + ".");
                    } else if (act.getChild(1).getText().matches("[0-9]+") && Integer.parseInt(act.getChild(1).getText()) > borneSup) {
                        System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + "Index " + act.getChild(1).getText() + " is superior to the upper boundary " + borneSup + ".");
                    } else if(act.getChild(1).getText().matches("[0-9]+.[0-9]+")){
                        System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : Array elements are reachable by their position in the Array (integers only), but "+act.getChild(1).getText()+" is real.");
                    }
                    if (nbChildren == 3) {
                        String type2 = analyseExp(act.getChild(2));
                        if (type.equals("integer")) {
                            if (!type.equals(type2) && !act.getChild(2).getText().matches("[0-9]+")) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found for " + act.getChild(2).getText() + ".");
                            }
                        } else if (type.equals("real")) {  //Il faut trouver comment echapper ce point du cul parce que sinon c'est cassÃ©
                            if (!type.equals(type2) && !act.getChild(2).getText().matches("[0-9]+.[0-9]+")) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found for " + act.getChild(2).getText() + ".");
                            }
                        }
                    }
                    if (nbChildren == 4) {
                        if (act.getChild(2).getText().matches("[0-9]+") && Integer.parseInt(act.getChild(1).getText()) < borneInf) {
                            System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + "Index " + act.getChild(2).getText() + " is inferior to the lower boundary " + borneInf + ".");
                        } else if (act.getChild(2).getText().matches("[0-9]+") && Integer.parseInt(act.getChild(1).getText()) > borneSup) {
                            System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + "Index " + act.getChild(2).getText() + " is superior to the upper boundary " + borneSup + ".");
                        }
                        String type2 = analyseExp(act.getChild(3));
                        if (type.equals("integer")) {
                            if (!type2.equals(type)) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found.");
                            } else if (!act.getChild(3).getText().matches("[0-9]+")) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found.");
                            }
                        } else if (type.equals("real")) {  //Il faut trouver comment echapper ce point du cul parce que sinon c'est cassÃ©
                            if (!type.equals(type2)) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found.");
                            } else if (!act.getChild(3).getText().matches("[0-9]+.[0-9]+")) {
                                System.out.println("\033[31mERROR\033[0m : line "+act.getLine() + ", position "+ act.getCharPositionInLine()+ " : " + type + " expected but " + type2 + " found : " + act.getChild(2).getText() + ".");
                            }
                        }
                    }
                }

            }
        }
        return null;
    }

    private String analyseBornes(Tree exp) {

        String s0 = exp.getChild(0).getText();
        String s1 = exp.getChild(1).getText();
        String type0 = null;
        String type1 = null;
        if (s0.matches("[0-9]+")) {
            type0 = "integer";
        } else if (s0.matches("[0-9]+.[0-9]+")) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Boundaries can't be reals : " + s0 + ".");
        } else {
            analyseExp(exp.getChild(0));
        }

        if (s1.matches("[0-9]+")) {
            type0 = "integer";
        } else if (s1.matches("[0-9]+.[0-9]+")) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Boundaries can't be reals : " + s1 + ".");
        } else { //toujours dans l'analyse syntaxique je pense
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Second boundary does not match any known type.");
        }


        return null;
    }

    private String analyseForcondition(Tree exp) {

        String type = null;
        if (!(analyseIdf(exp.getChild(0)).equals("integer")||analyseIdf(exp.getChild(0)).equals("real"))) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Iterators must be typed integer or real : " + analyseIdf(exp.getChild(0)) + " found.");
        }
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseIfstatement(Tree exp) {

        int nbChildren = exp.getChildCount();
        String type = null;
        for (int i = 0; i < nbChildren; i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseSinonAlors(Tree exp) {

        String type = analyseExp(exp.getChild(0));

        return type;
    }

    private String analysePlus(Tree exp) {
        String s1 = exp.getChild(0).getText();
        String s2 = exp.getChild(1).getText();
        String type2 = null;
        String type1 = null;
        String result = null;
        switch (s1) {
            case "+":
                type1 = analysePlus(exp.getChild(0));
                break;
            case "-":
                type1 = analyseMoins(exp.getChild(0));
                break;
            case "*":
            case "/":
            case "%":
                type1 = analyseOpmultiplicatif(exp.getChild(0));
                break;
            case "**":
                type1 = analysePuissance(exp.getChild(0));
                break;
            default:
                type1 = analyseIdf(exp.getChild(0));
        }
        switch (s2) {
            case "+":
                type2 = analysePlus(exp.getChild(1));
                break;
            case "-":
                type2 = analyseMoins(exp.getChild(1));
                break;
            case "*":
            case "/":
            case "%":
                type2 = analyseOpmultiplicatif(exp.getChild(1));
                break;
            case "**":
                type2 = analysePuissance(exp.getChild(1));
                break;
            default:
                type2 = analyseIdf(exp.getChild(1));

        }
        if (type1.equals("boolean") || type2.equals("boolean")) {
            System.out.println("\033[31mERROR\033[0m : line "+exp.getLine() + ", position "+ exp.getCharPositionInLine()+ " : " + "Booleans can't be added.");
            result = "boolean";
        } else if (type1.equals("real") || type2.equals("real")) {
            result = "real";
        }else{
            result = "integer";
        }

        return result;
    }

    private String analyseProch(Tree exp) {
        String type = null;
        for (int i = 1; i < exp.getChildCount(); i++) {
            type = analyseExp(exp.getChild(i));
        }
        return type;
    }

    private String analyseVP(Tree exp) {

        String type = analyseExp(exp.getChild(0));
        return null;
    }
}
