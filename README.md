# Développement d'un compilateur pour le langage Algol60
> Explication de la partie test finale du projet, dans laquelle nous devions proposer 4 à 5 programmes que notre compilateur pouvait faire tourner. 

Consignes d'utilisation :

    Depuis la souche du projet faire:
      ./build.sh
      ./compile.sh arg1 arg2 programme.a60 (arg1 = 1 si l'on souhaite afficher l'AST, 0 sinon | arg2 = 1 s'il on souhaite afficher la TDS, 0 sinon | programme à choisir parmi : factorielle, puissance, NestedIf, fibonacci et NotrePlusBeauProgramme)
      ./run.sh programme.src (programme étant le programme choisi précédemment dans la liste ci-dessus)

Explication des résultats affichés (avant la partie "Simulation terminée"):

    Factorielle : Valeur initiale de x | Valeur de x := fact(x)

    Puissance : Valeur initiale de x | Valeur de a | Valeur de x := puissance(x,a) (x=x^a)

    Fibonacci : Valeur initiale de x | Valeur de x := fibonnaci(x)

    NestedIf : Valeur finale de x | Valeur finale de a (nous vous invitons à ouvrir le fichier de cette fonction pour une meilleure compréhension : il ne s'agit en rien d'une fonction classique, elle sert simplement à démontrer le bon fonctionnement de IF imbriqués)

    NotrePlusBeauProgramme : Affiche toutes les valeurs impaires comprises entre 1 et x, puis le nombre de valeurs précédemment affichées.
