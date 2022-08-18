package com.example.hello.qAa;

import java.util.ArrayList;
import java.util.List;

public class bigDaddyClass { //class
    List<String> questions = new ArrayList<>();
    List<String> answers = new ArrayList<>();
    public List<String> getQuestions() {
        return questions;
    }
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public List<String> GetAnswers(){
        return answers;
    }
    public void SetAnswers(List<String> answers){
        this.answers = answers;
    }

    public void SetBoth(List<String> questions, List<String> answers){
        this.questions = questions;
        this.answers = answers;
    }

    public bigDaddyClass(List<String> questions, List<String> answers){ //constructor
        this.questions = questions;
        this.answers = answers;
    }

}


//static you have to use variables or methods directly without object