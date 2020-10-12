#!/bin/bash

javac -classpath ./antlrworks-1.5.1.jar ./src/tds/*.java -d ./classes ./src/main/*.java

#Pour créer le jar si nécessaire
#jar cf compil.jar ./*
