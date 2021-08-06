package Hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int count = 0;
        int r1 = rand.nextInt(10);
        String[] list = new String[10];
        list[0] = "elephant";
        list[1] = "yummy";
        list[2] = "jam";
        list[3] = "whomever";
        list[4] = "quizzes";
        list[5] = "luxury";
        list[6] = "strengths";
        list[7] = "cycle";
        list[8] = "beekeeper";
        list[9] = "squawk";
        StringBuilder word2 = new StringBuilder("");
        String word = (list[r1]);
        int guesses = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            word2 = new StringBuilder(word2 + "_");
        }
        System.out.println("Welcome to Hangman!");
        System.out.println("You have 7 wrong guesses until Game over.");
        System.out.println("The word has " + length + " letters.");
        System.out.println(word2);
        while (count < 7) {
            int correct = 0;
            System.out.println("Guess a letter");
            String guess = input.next();
            String guessed = guess.substring(0, 1);
            char c = guessed.charAt(0);
            for (int j = 0; j < length; j++) {
                String index = word.substring(j, j + 1);
                if (index.equals(guessed)) {
                    word2.setCharAt(j, c);
                    correct = 1;
                    guesses += 1;
                } else {
                }
            }
            String word3 = word2.toString();
            System.out.println("");
            System.out.println(word2);
            if (correct == 1) {
                System.out.println(guessed + " is correct.");
            } else {
                count++;
                System.out.println(guessed + " is incorrect.");
            }
            System.out.println("");
            System.out.println(7 - count + " guesses left.");
            System.out.println("");
            if (count == 1) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                System.out.println();
            }
            if (count == 2) {
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                System.out.println("");
            }
            if (count == 3) {
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
                System.out.println("");
            }
            if (count == 4) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                System.out.println("");
            }
            if (count == 5) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
                System.out.println("");
            }
            if (count == 6) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
            }
            if (count == 7) {
                System.out.println("Game over!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                System.out.println("The word was " + word);
            }
            if (word3 == null ? word == null : word3.equals(word)) {
                System.out.println("Well done, you found the word " + word + " with " + guesses + " correct guesses and " + count + " wrong guesses.");
                count += 7;
            }
        }
    }
}
