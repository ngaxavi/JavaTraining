package javatraining.exercise_3;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Numbers0to9 {

    private static final int LAST_NUMBER = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl Zeilen: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            int number = i % LAST_NUMBER;
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
