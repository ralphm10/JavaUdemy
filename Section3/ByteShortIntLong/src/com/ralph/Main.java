package com.ralph;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum value " + myMinIntValue);
        System.out.println("Maximum value " + myMaxIntValue);
        System.out.println("Busted max!!! = " + (myMaxIntValue + 1));
        System.out.println("Busted min!!! - " + (myMinIntValue - 1));

        int myMaxInt = 2147483_645;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min = " + myMinByteValue);
        System.out.println("Byte max = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min = " + myMinShortValue);
        System.out.println("Short max = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min = " + myMinLongValue);
        System.out.println("Long max = " + myMaxLongValue);

        long bigLong = 2147483_645_2L;

        byte newByteValue = (byte) (myMinByteValue / 2);

        byte challengeByte = 10;
        short challengeShort = 888;
        int challengeInt = 10000;

        long challengeSum = 50000 + (10 * (challengeByte + challengeInt + challengeShort));
        System.out.println("Answer is: " + challengeSum);
    }
}
