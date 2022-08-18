package com.example.hello.superClasses;

public class subClass2 extends superClass{

    public subClass2(String name){
        super(name);
    }

    @Override
    public String saySomething(){
        return this.name + "is a cool dude";
    }

}
