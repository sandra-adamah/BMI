package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        //phase 2 (initalizing)
        keyboard = new Scanner(System.in);

        int heightInFeet, heightInInches, totalHeight;
        double inchesInMeters,weightInPounds,total,weightInKg;

        System.out.println("What is your height? (in feet)");
        heightInFeet = keyboard.nextInt();

        System.out.println("What is your height? (in inches)");
        heightInInches = keyboard.nextInt();

        totalHeight = ((heightInFeet*12)+heightInInches);
        inchesInMeters = (totalHeight *0.0254);
        //gathered all the information need for the height

        System.out.println("How much do you weigh? (in pounds)");
        weightInPounds = keyboard.nextInt();

        weightInKg = (weightInPounds*0.453592);
        //gathering information on weight

        total = (weightInKg/(inchesInMeters*inchesInMeters));
        System.out.println("Your BMI is "+total+"");









        //bmi = weight(in kilograms) / height(in centimeters) squared
        // 1 in = 0.0254 meter

    }
}
