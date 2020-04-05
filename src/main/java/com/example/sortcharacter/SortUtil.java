package com.example.sortcharacter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class SortUtil {

    private static Logger logger = Logger.getLogger("SortUtil");

    public static List<String> readFile(String filePath) {
        logger.info("Reading file from a path : " + filePath);
        //reading text file into list
        List<String> paragraphLines = Collections.EMPTY_LIST;
        try {
            if (!Objects.isNull(filePath)) {
                paragraphLines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
            } else {
                logger.info("File path is null or empty");
            }
        } catch (IOException io) {
            logger.info("IOException occurred due to failed to read file from given path" + io);
        }
        return paragraphLines;
    }

    public static void sortCharacters(List<String> paragraphs) {
        if (!paragraphs.isEmpty()) {
            String paragraphString = paragraphs.toString();
            logger.info("\n\tAll Paragraphs in one String : \n \t" + paragraphString);
            paragraphString = paragraphString.replaceAll(Constants.REMOVE_SPL_CHARACTERS, Constants.EMPTY);
            logger.info("\n\tParagraph after removing special characters before sort : \n\t" + paragraphString);
            char[] charArray = paragraphString.trim().toLowerCase().toCharArray();
            Arrays.sort(charArray);
            logger.info("\n\tSorted characters from a paragraph : \n\t" + String.valueOf(charArray));
        } else {
            logger.info(Constants.FILE_IS_EMPTY);
        }
    }
}
