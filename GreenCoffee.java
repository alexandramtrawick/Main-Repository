package com.aca;

import java.util.Scanner;
//COMPLETE
public class GreenCoffee {
    public static void main(String[] args) {
        /*discount determined base on if user rides bike or rides bus
        1. user chooses bike or bus
        2. user inputs distance of commute
        3. RULES:
            ANY commute < 21 miles = "free coffee"

            bike < 30 miles = "10% discount"
            bike < 50 miles = "20% discount"

            bus >= 35 miles = "20% discount"
            bus < 50 miles = "30% discount"

            *discounts should be combined if more than one apply
         */

        Scanner one = new Scanner(System.in);
        System.out.println("Did you ride a bicycle or a bus? Answer with 1 for 'bike' or 2 for 'bus' ");
        int bikeOrBus = one.nextInt();

        if(bikeOrBus < 1 || bikeOrBus > 2) {
            System.out.println("Not a valid form of transportation.");
            System.exit(0);
        }

        Scanner two = new Scanner(System.in);
        System.out.println("How long was your commute? Input # of miles: ");
        int miles = two.nextInt();

        if(bikeOrBus == 1){
            bike(miles);
        }else{
            bus(miles);
        }

    }

    public static void bike(int miles){
        int discount = 0;
        String freeCoffee;
        if(miles < 21){
            freeCoffee = "free coffee";
        }else{
            freeCoffee = "no free coffee";
        }
        if(miles < 30){
            discount += 10;
        }
        if(miles < 50){
            discount += 20;
        }
        System.out.println("Your discount is..." + freeCoffee + " and " + discount + "% off");
    }
    public static void bus(int miles){
        int discount = 0;
        String freeCoffee;
        if(miles < 21){
            freeCoffee = "free coffee";
        }else{
            freeCoffee = "no free coffee";
        }
        if(miles >= 35){
            discount += 20;
        }
        if(miles < 50){
            discount += 30;
        }
        System.out.println("Your discount is..." + freeCoffee + " and " + discount + "% off");
    }
}
