package com.example.sortcharacter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SortCharacterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortCharacterApplication.class, args);
        //Read a paragraph from a file located in resource folder
        SortCharacterApplication.readFile();
    }


    private static void readFile() {
        //reading text file into list
        List<String> lines = Collections.EMPTY_LIST;
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/paragraph.txt"), StandardCharsets.UTF_8);
        } catch (IOException io) {
            io.printStackTrace();
        }
        System.out.println("Content of List:");
        System.out.println(lines);
    }

}
