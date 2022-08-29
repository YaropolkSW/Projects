package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Reversing().reversingByRule(scanner.nextLine()));
    }
}

class Reversing {
    private final String EMP = "";
    private final String SEP = " ";
    private final String PATTERN = "[^a-zA-Z]";

    public String reversingByRule(String line) {
        String[] words = line.split(SEP);
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder builder = new StringBuilder(word.replaceAll(PATTERN, EMP)).reverse();

            for (int i = 0; i < word.length(); i++) {
                if (!(Character.isLetter(word.charAt(i)))) {
                    builder.insert(i, word.charAt(i));
                }
            }

            result.append(builder).append(SEP);
        }

        return result.toString().trim();
    }
}