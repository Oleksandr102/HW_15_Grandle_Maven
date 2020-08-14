package com.company.logic;

import java.util.*;

import static com.company.logic.Reader.readFile;
import static com.company.logic.RemoveShort.removeShortWords;
import static com.company.logic.WordCount.countWords;

public class Executor {
    private final String DATA_FILE = "src\\main\\resources\\data.txt";

    public void run() {
        List<String> songText = Cleaner.removeSymbols(readFile(DATA_FILE));

        int totalWordCount = countWords(songText);
        List<String> textWithoutShortWords =
                removeShortWords(songText, 3);
        int withoutShortWords =
                countWords(removeShortWords(songText, 3));

        System.out.println("Total words: " + totalWordCount);
        System.out.println("Words longer than 3: "
                + textWithoutShortWords);
        System.out.println("Total words longer than 3: "
                + withoutShortWords);
        System.out.println("First 3 most repeated:");
        WordCount.mostUsedWords(songText, 3).forEach((word, count) -> System.out.println(word + " = " + count));
    }
}
