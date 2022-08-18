package com.example.hello.bank;

import java.util.Scanner;

import static java.lang.Math.abs;

public class checkndepInitial {
    private int currentValue;

    public checkndepInitial(){
        //starting an account at an initial amount
        Scanner scanner = new Scanner(System.in);
        boolean keepOn = true;
        System.out.println("What's your initial amount to be deposited?");
        while(keepOn) {
            int value = Integer.parseInt(scanner.next());
            if (value > 420) {
                this.currentValue = value;
                keepOn = false;
            }else{
                System.out.println("Min $420");
            }
        }
    }

    public void takeMoney(int overdraw){
        Scanner scanner = new Scanner(System.in);
        boolean gogo = true;
        while(gogo) {
            int taken = abs(Integer.parseInt(scanner.next()));
            if (this.currentValue + overdraw >= taken) {
                this.currentValue = this.currentValue - taken;
                System.out.println("Current amount " + this.currentValue);
                gogo = false;
            } else {
                System.out.println("Max amount you can withdraw is " + (this.currentValue + overdraw));
            }
        }
    }

    public void depositMoney(int deposit){
        this.currentValue += deposit;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
