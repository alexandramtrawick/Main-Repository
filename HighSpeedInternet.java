package com.aca;

import java.util.Scanner;

public class HighSpeedInternet {
    public static void main(String[] args) {
        /*
        HSI = High Speed Internet

        Rules:
        1. Today's options are HSI of 5M, 10M, 20M, or 50M
        2. State options are IA, MO, and AR
        3. IA that have current speed < 30M are offered free upgrade to 50M
        4. AR are offered no upgrade
        5. MO that have current speed < 10M are offered free upgrade to 20M


        IA
        if current speed < 30M, free upgrade to 50M

        MO
        if current speed < 10M, free upgrade to 20M
        if current speed < 25M and >= 10M, free upgrade to 50M

        AR = no upgrade

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your state initials: ");
        String state = scan.next();
        if (!(state.equalsIgnoreCase("IA") && !(state.equalsIgnoreCase("MO") && !(state.equals("AR"))))) {
            System.out.println("Not a valid state.");
            System.exit(0);
        }

        Scanner scanTwo = new Scanner(System.in);
        System.out.print("Enter your current internet speed (exclude 'M'): ");
        int speed = scanTwo.nextInt();

        if (state.equalsIgnoreCase("IA")) {
            Iowa(speed);
        } else if (state.equalsIgnoreCase("MO")) {
            Missouri(speed);
        } else {
            Arkansas(speed);
        }

    }
    public static void Iowa(int speed){
        if(speed < 30){
            System.out.print("Free upgrade to 50M.");
        }else{
            System.out.print("Sorry, no upgrade offer.");
        }
    }
    public static void Missouri(int speed){
        if(speed < 10){
            System.out.print("Free upgrade to 20M.");
        }else if(speed < 25){
            System.out.print("Free upgrade to 50M.");
        }else{
            System.out.print("Sorry, no upgrade offer.");
        }
    }
    public static void Arkansas(int speed){
        System.out.print("Sorry, no upgrade offer.");
    }
}
