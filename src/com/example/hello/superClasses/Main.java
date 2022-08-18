package com.example.hello.superClasses;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        subClass person1 = new subClass("jorge"){
            @Override
            public void gay() {
                System.out.println(this.name + " sheesh kebab");
            }
        };

        person1.gay();

        subClass person2 = new subClass("mark");

        subClass2 person3 = new subClass2("loide");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        person1.setName("george");

        System.out.println(person1.saySomething());
        System.out.println(person2.saySomething());
        System.out.println(person3.saySomething());

        List<superClass> superList = new ArrayList<>();
        superList.add(person1);
        superList.add(person2);
        superList.add(person3);

        superList.get(0).setName("georgia");

        System.out.println(superList.get(0).saySomething());
        System.out.println(superList.get(1).saySomething());
        System.out.println(superList.get(2).saySomething());

        System.out.println(person1.getName());

        superClass animal = new subClass("bartolomeu");
        subClass animal2 = new subClass("bartolomeu2");

        System.out.println(animal.getName());
        System.out.println(animal2.getName());

        person1.gay();

        List<IIsGay> gayppl = new ArrayList<>();
        gayppl.add(person1);
        gayppl.add(person2);

        gayppl.get(0).gay();
        gayppl.get(1).gay();



}
}
