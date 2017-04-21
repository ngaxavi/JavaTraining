package javatraining.exercise_3;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Factoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl eingeben: ");
        int number = scanner.nextInt();

        System.out.print(number + " = ");
        int factor = 2;
        while (number != 1) {
            if (number % factor == 0) {
                System.out.print(factor);
                number /= factor;
                if (number != 1) {
                    System.out.print(" * ");
                }
            } else {
                factor++;
            }
        }
    }
}
