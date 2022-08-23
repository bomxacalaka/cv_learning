package com.example.hello.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArmstrongChecker {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        int o = 0;
        for (int i = 0; i < 10000000; i++) {
            String numStr = Integer.toString(i);
            for (int j = 0; j < numStr.length(); j++) {
                o += Math.pow(Integer.parseInt(Integer.toString(i).split("")[j]), Integer.toString(i).length());
                }
            if(o == i){
                System.out.println(o);
            }
            o = 0;


        }

        System.out.println(LocalDateTime.now());
    }
}

//OUTPUT
//        2022-08-20T00:12:04.774323900
//        0
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        153
//        370
//        371
//        407
//        1634
//        8208
//        9474
//        54748
//        92727
//        93084
//        548834
//        1741725
//        4210818
//        9800817
//        9926315
//        2022-08-20T00:12:21.820833500