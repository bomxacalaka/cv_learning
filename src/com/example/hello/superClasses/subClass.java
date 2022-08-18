package com.example.hello.superClasses;

public class subClass extends superClass implements IIsGay{

    public subClass(String name){
        super(name);
    }

    @Override
    public String saySomething(){
        return this.name + " is cool";
    }

    @Override
    public void gay() {
        System.out.println(this.name + " is gay");
    }
}
