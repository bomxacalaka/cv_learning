package com.example.hello.bank;

import java.util.ArrayList;

public class testingMain {
    public static void main(String[] args) {
        ArrayList<personClass> customersPersonalInfo = new ArrayList<>();
        ArrayList<checkndepInitial> customersCheckingAcc = new ArrayList<>();
        ArrayList<bankClass> costumerBankAcc = new ArrayList<>();

        int customerID = 0;

        for (int i = 0; i < 2; i++) {


            customersPersonalInfo.add(new personClass());

            customersPersonalInfo.get(customerID).setAge();




            customerID++;
        }
        for (int i4 = 0; i4 < customersPersonalInfo.size(); i4++) {
            System.out.print(customersPersonalInfo.get(i4).getAge());
        }
    }
}
