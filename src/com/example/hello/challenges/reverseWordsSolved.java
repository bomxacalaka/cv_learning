package com.example.hello.challenges;

public class reverseWordsSolved {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }



}
