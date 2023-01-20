#!/bin/bash


echo "⚙ Start compilation..."

kotlinc  variables/main.kt  -include-runtime -d main.jar

echo "⚡ Running..."

java -jar main.jar