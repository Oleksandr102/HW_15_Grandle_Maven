package com.company.logic;

import java.util.List;
import java.util.stream.Collectors;

public class Cleaner {
    public static List<String> removeSymbols(List<String> stringList) {
        return stringList.stream()
                .map(s -> s.replace(",", ""))
                .map(s -> s.replace(" ", ""))
                .map(s -> s.replace("(", ""))
                .map(s -> s.replace(")", ""))
                .map(s -> s.replace("!", ""))
                .collect(Collectors.toList());
    }
}
