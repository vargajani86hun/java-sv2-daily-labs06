package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer pnc = new PositiveNumberContainer();
        Scanner scr = new Scanner(System.in);
        double number;
        do {
            System.out.println("Adjon meg egy valós számot:");
            number = scr.nextDouble();
            if (number > 0) {
                pnc.addNumber(number);
            }
        } while (number > 0);
        System.out.println(pnc);
    }
}
