package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        //phase 2 (initalizing)
        keyboard = new Scanner(System.in);

        int heightInFeet, heightInInches;

        System.out.println("What is your height? (in feet)");
        heightInFeet = keyboard.nextInt();

        System.out.println("What is your height? (in inches)");
        heightInInches = keyboard.nextInt();




        //bmi = weight(in kilograms) / height(in centimeters) squared
        // 1 in = 0.0254 meter

    }
}
