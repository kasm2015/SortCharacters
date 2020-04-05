package com.example.sortcharacter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortUtil {

    public static List<String> readFile() {
        //reading text file into list
        List<String> paragraphLines = Collections.EMPTY_LIST;
        try {
            paragraphLines = Files.readAllLines(Paths.get(Constants.FILE_PATH), StandardCharsets.UTF_8);
        } catch (IOException io) {
            System.out.println("IOException occurred due to failed to read file from given path" +io);
        }
        return paragraphLines;
    }
}
