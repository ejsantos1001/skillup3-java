package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(calcFeetAndInchesToCentimeters(-1));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double feetToCentimeter;
        double inchToCentimeter;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            feetToCentimeter = feet * 30.48;
            inchToCentimeter = inches * 2.54;
            return feetToCentimeter + inchToCentimeter;
        } else {
            return -1;
        }
    }


    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet;
        if (inches >= 0) {
            feet = inches / 12;
            return calcFeetAndInchesToCentimeters(feet, 0);
        } else {
            return -1;
        }
    }

}
