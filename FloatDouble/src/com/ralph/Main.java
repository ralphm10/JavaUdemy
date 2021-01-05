package com.ralph;

public class Main {

    public static void main(String[] args) {
	    
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min = " + myMinFloatValue);
        System.out.println("Float max = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min = " + myMinDoubleValue);
        System.out.println("Double max = " + myMaxDoubleValue);

        int myInt = 5 / 2;
        float myFloat = 5f / 3f;
        double myDouble = 5.00 / 3d;

        System.out.println("Float = " + myFloat);
        System.out.println("Double = " + myDouble);

        double pounds = 200d;
        double kilos = pounds * 0.45359237d;

        System.out.println("Kilos = " + kilos);

    }
}
