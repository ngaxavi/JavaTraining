package javatraining.exercise_1;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Fraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ganzzahl1 eingeben: ");
        int wholePart1 = scanner.nextInt();

        System.out.print("Zaehler1 eingeben: ");
        int numerator1 = scanner.nextInt();

        System.out.print("Nenner1 eingeben: ");
        int denominator1 = scanner.nextInt();

        System.out.print("Ganzzahl2 eingeben: ");
        int wholePart2 = scanner.nextInt();

        System.out.print("Zaehler2 eingeben: ");
        int numerator2 = scanner.nextInt();

        System.out.print("Nenner2 eingeben: ");
        int denominator2 = scanner.nextInt();


        System.out.print(wholePart1 + " " + numerator1 + "/" + denominator1 + " + ");
        System.out.print(wholePart2 + " " + numerator2 + "/" + denominator2 + " = ");

        int wholeNumberResult = wholePart1 + wholePart2;
        int numeratorResult = numerator1 * denominator2 + numerator2 * denominator1;
        int denominatorResult = denominator1 * denominator2;

        System.out.print(wholeNumberResult + " " + numeratorResult + "/" + denominatorResult + " = ");
        numeratorResult += wholeNumberResult * denominatorResult;
        System.out.println(numeratorResult + "/" + denominatorResult);

    }
}
