package com.example.hello.superClasses;

public abstract class superClass{ //abstract class means you cant make an object directly out of a class

    protected String name;

    public superClass(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract String saySomething();


}
