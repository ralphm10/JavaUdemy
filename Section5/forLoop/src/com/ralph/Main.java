package com.ralph;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("10k at " + i + "% interest is: " + String.format("%.2f", calcInterest(10000, i)));
        }

        System.out.println("----------");

        for (int i = 8; i > 1; i--) {
            System.out.println("10k at " + i + "% interest is: " + String.format("%.2f", calcInterest(10000, i)));
        }

        System.out.println("----------");

        int primeCount = 0;
        for (int i = 1; i < 15; i++) {

            if(isPrime(i)) {
                primeCount ++;
                System.out.println(i + " is a prime number");
            }
            if(primeCount == 3) {
                break;
            }

        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calcInterest(double amount, double rate) {
        return amount * (rate / 100);
    }
}