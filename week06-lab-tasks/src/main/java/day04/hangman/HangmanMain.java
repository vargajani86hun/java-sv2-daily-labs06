package day04.hangman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "alma";
    private String wordFound;
    private int chances = 8;

    public HangmanMain() {
        char[] chars = new char[wordToFind.length()];
        for (int i = 0; i < wordToFind.length(); i++){
            chars[i] = '_';
        }
        wordFound = new String(chars);
    }

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        do {
            printStatus(wordFound, chances);
            System.out.println("Mi a következkő tipped?");
            String guess = sc.nextLine();
            String status = updateWordFound(wordToFind, wordFound, guess);
            if (status.equals(wordFound)) {
                chances--;
            }
            wordFound = new String(status);
        }
        while ((!(wordFound.equals(wordToFind))) && (chances > 0));

        if (wordFound.equals(wordToFind)) {
            System.out.println("Gratulálok, nyertél!");
        }
        else {
            System.out.println("Vesztettél!");
        }
    }

    private void printStatus(String status, int chances) {
        System.out.println("Itt tartasz: " + status);
        System.out.println("Ennyi tipped van még: " + chances);
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}
