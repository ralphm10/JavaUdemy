package com.ralph;

public class Main {

    public static void main(String[] args) {

       int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score: " + finalScore);

       finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score: " + finalScore);

        int tablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ralph", tablePosition);

        tablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Dave", tablePosition);

        tablePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Matt", tablePosition);

        tablePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Lou", tablePosition);

        tablePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Andy", tablePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String playerName, int postion) {
        System.out.println(playerName + " is position " + postion + " in the table");
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;

    }
}
