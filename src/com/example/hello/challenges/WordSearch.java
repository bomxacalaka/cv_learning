package com.example.hello.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {

        String phrase = "The quick brown fox jumped over the lazy dog";
        StringBuilder words2 = new StringBuilder();

        String[] words = phrase.split("");

        Scanner scanner = new Scanner(System.in);
        String b = "o";


        System.out.println(Arrays.toString(words));

        for (String a : words) {
            if (b.equals(a.toLowerCase())) System.out.println("found");
        }

        int c = 1234567;

        System.out.println(Integer.parseInt(String.valueOf(c).split("")[0]) + Integer.parseInt(String.valueOf(c).split("")[1]) > Integer.parseInt(String.valueOf(c).split("")[2]));

    }
}
