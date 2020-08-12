package com.company.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> readFile(String fileName) {
        List<String> strings = new ArrayList<>();
        try (Scanner scr = new Scanner(new File(fileName))) {
            while (scr.hasNextLine()) {
                strings.add(scr.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
