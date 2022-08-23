package com.example.hello.pointy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // parameter -> expression

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Waiting for 3 Seconds!");
        // Sleep for 3 seconds
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());



        int x = 1+1;
        Supplier<Integer> n = () -> 1+1;

        System.out.println(x);
        System.out.println(n.get());

        List<String> names = new ArrayList<>();
        names.add("alice");
        names.add("bob");
        names.add("charlie");
        names.add("david");
        names.add("eve");
        names.add("frank");
        names.add("george");
        names.add("harry");

        //names.forEach(a -> System.out.println(a));
//or
        //names.forEach(System.out::println);

        //names.forEach(Main::SayIt);


        System.out.println(Stream.of(names.stream()));
    }
    public static void SayIt(String name){
        System.out.println(name);
    }
}