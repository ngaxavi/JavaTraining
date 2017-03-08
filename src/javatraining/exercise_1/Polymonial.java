package javatraining.exercise_1;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */


public class Polymonial {

    private static final int A = 7;
    private static final int B = 5;
    private static final int C = 3;


    public static void main(String[] args) {
        System.out.println("Wir berechnen das Polynom 7x^2 + 5x + 3.");

        System.out.print("Bitte eine Zahl fuer \"x\" eingeben: ");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int result = A *(input*input) + B*input + C;

        System.out.println("Ergebnis: " + result);
    }
}
