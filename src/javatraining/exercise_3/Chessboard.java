package javatraining.exercise_3;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Chessboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
