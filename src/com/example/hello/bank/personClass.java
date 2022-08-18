package com.example.hello.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class personClass {

    private String[] name;
    private int age;
    private int ssn;

/*    public personClass(String[] name, int age, int ssn){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }*/

    public String[] getName() {
        return name;
    }

    public void setName() {
        //gets the persons first middle and last names as a String[] 'name'
        Scanner scanner = new Scanner(System.in);
        String[] numberOfQuestions = new String[]{"first name", "middle name", "last name"};
        String[] nameSet = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(numberOfQuestions[i]);
            nameSet[i] = scanner.next();
        }
        this.name = nameSet;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        // gets valid age and saves as an in 'age'
        Scanner scanner = new Scanner(System.in);
        boolean validSSN = true;
        int ageSet = 0;
        System.out.println("Whats your age?");
        while (validSSN) {
            String ageIn = scanner.next();
            ageSet = Integer.parseInt(ageIn);
            if (ageSet > 17 && ageSet < 70) {
                validSSN = false;
            }else{
                System.out.println("Invalid, you must be at least 18, max 69 years old to create a bank account");
            }
        }
        this.age = ageSet;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn() {

        // gets valid social security number and saves as an int 'ssn'
        Scanner scanner = new Scanner(System.in);
        boolean validSSN = true;
        int ssnSet = 0;
        System.out.println("Whats your social security number?");
        while (validSSN) {
            String ssnIn = scanner.next();
            if (ssnIn.length() % 7 == 0) {
                ssnSet = Integer.parseInt(ssnIn);
                validSSN = false;
            }else{
                System.out.println("Invalid, must be a 7 digits number");
            }
        }
        this.ssn = ssnSet;
    }
}
