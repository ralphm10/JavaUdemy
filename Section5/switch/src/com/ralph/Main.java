package com.ralph;

public class Main {

    public static void main(String[] args) {

        char switchChar = 'D';

        switch (switchChar) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchChar);
            default:
                System.out.println("Character not found");
        }

    }
}
