package com.company.logic;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveShort {
    public static List<String> removeShortWords(List<String> stringList, int length) {
        return stringList.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}
