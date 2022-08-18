package com.example.hello.bank;


/*

 * 3.b) Bank Management System:
 * Create a Bank Management System which has the following components:
 * Person (which saves first, middle and last name, age and a "social security number")
 * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
 * Checking Account (should have a current value, methods for taking and depositing money)
 * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
 *
 * BONUS: Make the Banking System Interactive (No Solution provided!)
 *
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class bankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<personClass> customersPersonalInfo = new ArrayList<>();
        ArrayList<checkndepInitial> customersCheckingAcc = new ArrayList<>();
        ArrayList<bankClass> costumerBankAcc = new ArrayList<>();

        costumerBankAcc.add(new bankClass(1000));
        customersPersonalInfo.add(new personClass());
        customersCheckingAcc.add(new checkndepInitial());

        boolean keepOn = true;
        int customerID = 0;

        while (keepOn) {

            customersPersonalInfo.get(customerID).setName();
            customersPersonalInfo.get(customerID).setAge();
            customersPersonalInfo.get(customerID).setSsn();


            customerID++;


            System.out.println("Add another user?(y/n)");
            keepOn = scanner.next().equals("y");
            if (keepOn){
                continue;
            }

            for (int i4 = 0; i4 < customersPersonalInfo.size(); i4++) {
                System.out.print(i4 + " ");
                System.out.print(customersPersonalInfo.get(i4).getName()[0] + " " + customersPersonalInfo.get(i4).getName()[1] + " " + customersPersonalInfo.get(i4).getName()[2] + " ");
                System.out.print(customersPersonalInfo.get(i4).getAge() + " ");
                System.out.print(customersPersonalInfo.get(i4).getSsn() + " ");
                System.out.println(customersCheckingAcc.get(i4).getCurrentValue());

            }


            keepOn = true;
            while (keepOn) {
                customerID = bankClass.loginSystem(customersPersonalInfo);

                System.out.print("Hello there, ");
                for (String name : customersPersonalInfo.get(customerID).getName()) {
                    System.out.print(name + " ");
                }
                System.out.println("");
                System.out.println("Balance: " + customersCheckingAcc.get(customerID).getCurrentValue());
                System.out.println("Money in or out (i/o)");

                if (scanner.next().equals("i")) {
                    System.out.println("Amount to deposit");
                    customersCheckingAcc.get(customerID).depositMoney(Integer.parseInt(scanner.next()));
                } else {
                    System.out.println("Amount to withdraw");
                    customersCheckingAcc.get(customerID).takeMoney(
                            costumerBankAcc.get(customerID).getMaxOverdraw());
                    }


                System.out.println("a to add another user l to login");
                keepOn = scanner.next().equals("l");
            }

            System.out.println("q to get out now s to stay");
            keepOn = !scanner.next().equals("q");
            customerID = 0;
        }




    }

}
