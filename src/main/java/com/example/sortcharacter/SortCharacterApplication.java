package com.example.sortcharacter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class SortCharacterApplication {

    private static Logger logger = Logger.getLogger("SortCharacter");

    public static void main(String[] args) {
        SpringApplication.run(SortCharacterApplication.class, args);
        //Read a paragraph from a file located in resource folder
        List<String> paragraphs = SortUtil.readFile(Constants.FILE_PATH);

        //Pass paragraph list to sort characters read from a file
        if(!paragraphs.isEmpty()) {
            SortUtil.sortCharacters(paragraphs);
        } else {
            logger.info("No Paragraphs found in a file");
        }
    }

}
