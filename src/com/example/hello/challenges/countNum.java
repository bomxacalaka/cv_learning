package com.example.hello.challenges;

public class countNum {
    public static void main(String[] args) {
        for (int i = -1000; i < 1000; i++) {
            int length = Integer.toString(Math.abs(i)).split("").length;
            System.out.println(length);
        }
    }
}
