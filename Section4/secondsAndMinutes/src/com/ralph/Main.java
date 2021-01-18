package com.ralph;

public class Main {

    public static void main(String[] args) {
        String test = getDurationString(65, 20);
        System.out.println(test);

        String secondTest = getDurationString(3665);
        System.out.println(secondTest);
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}

// An exercise to practice method overloading
