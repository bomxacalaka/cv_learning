package com.example.hello.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseWords {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> wordsReversed = new ArrayList<>();
        words.add("The quick brown fox jumped over the lazy dog");

        String words2 = "The quick brown fox jumped over the lazy dog";
        String wordsReversed2 = "";

        String[] words2A = words2.split(" ");

        for (int i = 0; i < words2A.length; i++) {
            wordsReversed2 += words2A[words2A.length - i - 1] + " ";
        }

        System.out.println(wordsReversed2);


    }
}
