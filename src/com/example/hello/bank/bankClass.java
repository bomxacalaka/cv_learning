package com.example.hello.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bankClass{


    private int maxOverdraw;

    public bankClass(int maxOverdraw){
        this.maxOverdraw = maxOverdraw;
    }

    public int getMaxOverdraw() {
        return maxOverdraw;
    }

    public void setMaxOverdraw(int maxOverdraw) {
        this.maxOverdraw = maxOverdraw;
    }
    public static int loginSystem(ArrayList<personClass> personClasses){
        Scanner scanner = new Scanner(System.in);
        String[] logIn = new String[2];
        int custumerID = 0;

        System.out.println("Login");
        boolean auth = false;
        while(!auth) {
            System.out.println("Name please");
            logIn[0] = scanner.next();
            System.out.println("SSN please");
            logIn[1] = scanner.next();

            for (personClass customer : personClasses) {
                if (logIn[0].equals(customer.getName()[0]) && logIn[1].equals(Integer.toString(customer.getSsn()))) {
                    System.out.println("Login successful");
                    auth = true;
                    continue;
                } else {
                    System.out.println("Login failed");
                }
                custumerID++;
            }
        }
        return custumerID;
    }
}
