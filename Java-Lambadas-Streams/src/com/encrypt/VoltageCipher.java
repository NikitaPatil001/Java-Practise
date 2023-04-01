package com.encrypt;

import java.util.HashMap;
import java.util.Map;

public class VoltageCipher {
	private static final Map<Character, Integer> VOLTAGE_TABLE = createVoltageTable();

    private static Map<Character, Integer> createVoltageTable() {
        Map<Character, Integer> table = new HashMap<>();
        int voltage = 0;
        for (char c = ' '; c <= '~'; c++) {
            table.put(c, voltage++);
        }
        return table;
    }

    public static String encrypt(String input) {
        // Validate input
        if (!input.matches("\\A\\p{ASCII}*\\z")) {
            throw new IllegalArgumentException("Input must contain only ASCII characters");
        }

        // Substitution phase
        StringBuilder substitutionBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            substitutionBuilder.append(VOLTAGE_TABLE.get(c));
        }

        // Transposition phase
        StringBuilder transpositionBuilder = new StringBuilder(substitutionBuilder.length());
        for (int i = substitutionBuilder.length() - 1; i >= 0; i--) {
            transpositionBuilder.append(substitutionBuilder.charAt(i));
        }

        return transpositionBuilder.toString();
    }
}
