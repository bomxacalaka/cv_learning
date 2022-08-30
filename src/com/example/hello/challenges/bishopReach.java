package com.example.hello.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bishopReach {

    public static void main(String[] args) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String[][] table = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                table[i][j] = alphabet[i] + Integer.toString(j);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ("b1".equals(table[i][j])) {
                }
            }
            System.out.println();
        }
    }



}
