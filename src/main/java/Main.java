package main.java;

import main.java.parser.JstatParser;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) throw new IllegalArgumentException("Wrong number of arguments");
        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        JstatParser jstatParser = new JstatParser();

        File sourceFile = jstatParser.getFile(sourceFilePath);
        File destinationFile = jstatParser.getFile(destinationFilePath);
        String parsedData = jstatParser.parseToDelimitedString(sourceFile);
        jstatParser.saveCsv(parsedData, destinationFile);
    }
}
