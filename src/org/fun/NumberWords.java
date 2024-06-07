package org.fun;

import java.util.HashMap;
import java.util.Map;

public class NumberWords {

    public static void main(String[] args) {
        NumberIntoWords(1223);
    }

    public static void NumberIntoWords(int n) {
        Map<Integer, Character> map = new HashMap<>();

        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Length of the string: " + s.length());

        // Fill the map with digits (1-26) mapped to corresponding characters
        for (int i = 0; i < s.length(); i++) {
            map.put(i + 1, s.charAt(i));
        }

        String v = String.valueOf(n);
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);
            int number = Character.getNumericValue(c);
            if (map.containsKey(number)) {
                char correspondingChar = map.get(number);
                System.out.println("For digit " + number + ", corresponding character is: " + correspondingChar);
                word.append(correspondingChar);
            } else {
                System.out.println("No corresponding character found for digit: " + number);
            }
        }

        System.out.println("Word representation: " + word.toString());
    }
}
