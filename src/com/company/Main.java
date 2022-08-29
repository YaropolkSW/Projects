package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reversingByRule(reader.readLine()));
    }

    public static String reversingByRule(String line) {
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i].replaceAll("[^a-zA-Z]", "")).reverse();

            for (int j = 0; j < words[i].length(); j++) {
                if (!(Character.isLetter(words[i].charAt(j)))) {
                    builder.insert(j, words[i].charAt(j));
                }
            }

            result.append(builder.toString()).append(" ");
        }

        return result.toString().trim();
    }
}

