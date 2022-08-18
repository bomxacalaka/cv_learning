package com.example.hello.exceptionTest;

public class Main {

    public static void main(String[] args) throws TestException {

        try{
            detectZeros(0);
        }catch (Exception e){
            System.out.println("AHHH EXCEPTION " + e.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("always happens");

    }

    public static void detectZeros(int num) throws TestException {
        if (num == 0){
            throw new TestException("ZERO DETECTED!");
        }
    }
}
