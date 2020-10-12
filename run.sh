#!/bin/bash

#Paramètres ./run prog.src
cd ./test_pieces/TestGenCode
java -jar ../../microPIUPK.jar -ass $1
fichiup=${1//src/iup}
java -jar ../../microPIUPK.jar -batch $fichiup
