package com.example.hello.challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayofMults {

    public static void main(String[] args) {
        int length = 10;
        int multiple = 12;
        int[] array = new int[length];


        for (int i = 1; i < length+1; i++) {
                array[i-1] = i*multiple;


        }

        System.out.println(Arrays.toString(array));
    }
}
