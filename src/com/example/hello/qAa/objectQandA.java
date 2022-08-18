package com.example.hello.qAa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class objectQandA {

    public static void main(String[] args) {

        int points = 0;

        List<String> q = new ArrayList<>();
        q.add("blue with yellow");
        q.add("ur mom");
        q.add("nice");

        List<String> a = new ArrayList<>();
        a.add("green");
        a.add("gae");
        a.add("69");

        //builts an object using 2 lists
        bigDaddyClass questionsAndAnswers = new bigDaddyClass(q,a);


        Scanner reply = new Scanner(System.in);

        for (int i = 0; i < questionsAndAnswers.getQuestions().size(); i++) {
            System.out.println(questionsAndAnswers.getQuestions().get(i));
            String repl = reply.next();
            if(repl.equals(questionsAndAnswers.GetAnswers().get(i))){
                System.out.println("Congrats!");
                points++;
            }else{
                System.out.println("Sorry but the right answer was " + questionsAndAnswers.GetAnswers().get(i));
            }
        }
        System.out.println("Score:" + points);


        List<String> q2 = new ArrayList<>();
        q.add("red with yellow");
        q.add("cyka");
        q.add("answer to life");

        List<String> a2 = new ArrayList<>();
        a.add("orange");
        a.add("blyat");
        a.add("42");

        questionsAndAnswers.SetBoth(q,a);


        points = 0;
        for (int i = 3; i < questionsAndAnswers.getQuestions().size(); i++) {
            System.out.println(questionsAndAnswers.getQuestions().get(i));
            String repl = reply.next();
            if(repl.equals(questionsAndAnswers.GetAnswers().get(i))){
                System.out.println("Congrats!");
                points++;
            }else{
                System.out.println("Sorry but the right answer was " + questionsAndAnswers.GetAnswers().get(i));
            }
        }
        System.out.println("Score:" + points);


    }

}
