package com.company;

public class Reversing {
    private static final String EMPTY_STRING = "";
    private static final String SEPARATOR = " ";
    private static final String PATTERN = "[^a-zA-Z]";

    public String reversingByRule(String line) {
        final String[] words = line.split(SEPARATOR);
        final StringBuilder result = new StringBuilder();

        for (final String word : words) {
            final StringBuilder builder = new StringBuilder(word.replaceAll(PATTERN, EMPTY_STRING)).reverse();

            for (int i = 0; i < word.length(); i++) {
                if (!(Character.isLetter(word.charAt(i)))) {
                    builder.insert(i, word.charAt(i));
                }
            }

            result.append(builder).append(SEPARATOR);
        }

        return result.toString().trim();
    }
}
