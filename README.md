# README #

text Jstat parser

### What is it? ###

This program parses data from jstat program into csv format for further analysis.

### How do I get set up? ###

**WINDOWS**

* Run textJstat.bat

Provide test case name and jstat arguments into textJstat.bat arguments. 

E.g. `./textJstat.bat "myTest1" -gcutil 4041 1000`,

will monitor application with id 4041 with one second interval and produce result file named "myTest1.txt"

* Create parser JAR 

* Run created JAR:

`java -jar textJstatParser.jar "C:\textJstatProducedFile.txt" "C:\destinationCsvFile.csv"`
