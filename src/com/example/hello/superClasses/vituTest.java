package com.example.hello.superClasses;

import java.util.Scanner;

public class vituTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(scanner.next().equals("a")){
                System.out.println("move left");
            }
            if(scanner.next().equals("d")){
                System.out.println("move right");
            }
        }
    }
}
