#!/bin/bash

#Paramètres exemple donné prog.a60 prog.src
#pour nous: prog.a60
cd classes/
#affichage TDS par défault
#java -classpath ../antlrworks-1.5.1.jar: main.Main 0 1 ../test_pieces/TestGenCode/$1
#si on veut mettre des 0 ou 1 au choix pour l'ast et la tds
java -classpath ../antlrworks-1.5.1.jar: main.Main $1 $2 ../test_pieces/TestGenCode/$3
