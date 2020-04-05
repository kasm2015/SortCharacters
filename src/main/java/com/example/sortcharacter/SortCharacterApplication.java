package com.example.sortcharacter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SortCharacterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortCharacterApplication.class, args);
        //Read a paragraph from a file located in resource folder
        List<String> paragraphs = SortUtil.readFile();

        if (!paragraphs.isEmpty()) {
            String paragraphString = paragraphs.toString();
            paragraphString = paragraphString.replaceAll(Constants.REMOVE_SPL_CHARACTERS, Constants.EMPTY);
            System.out.println("Para String : " +paragraphString);
            char[] charArray = paragraphString.trim().toLowerCase().toCharArray();
            Arrays.sort(charArray);
            System.out.println("Sorted string " + String.valueOf(charArray));
        } else {
            System.out.println("File is either empty or no characters found");
        }
    }






}
