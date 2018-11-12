package main.java.parser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class JstatParser {
    private static final String REGEXP = "\\s+";

    public File getFile(String path) {
        return new File(path);
    }

    public String parseToDelimitedString(File file) {
        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(REGEXP);
                String join = String.join(";", split);
                sb.append(join).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public void saveCsv(String fileData, File destination) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(destination)) {
            fileOutputStream.write(fileData.getBytes());
        } catch (IOException e) {
            System.out.println("Could not save file");
        }
        System.out.println("Success!");
    }

}
