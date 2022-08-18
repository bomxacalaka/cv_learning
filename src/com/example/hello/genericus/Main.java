package com.example.hello.genericus;

public class Main {

    public static void main(String[] args) {

    Pair<Integer, Float> generics = new Pair<>(69,42f);

    System.out.println(generics.getFirst());
}
}
