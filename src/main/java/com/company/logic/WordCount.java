package com.company.logic;

import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static int wordsCount(List<String> stringList) {
        return stringList.size();
    }

    public static Map<String, Integer> wordAppearance(List<String> textSong, int limit) {
        Map<String, Integer> wordCount = new HashMap<>();
        Integer count;
        for (String word : textSong) {
            count = wordCount.get(word);
            if (count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }
        wordCount = wordCount
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(limit)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
        return wordCount;
    }
}
