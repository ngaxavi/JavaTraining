package javatraining.exercise_1;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte x eingeben: ");
        int x = scanner.nextInt();

        System.out.print("Bitte y eingeben: ");
        int y = scanner.nextInt();

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Variableninhalte nach Tausch: x = " + x + ", y = " + y);
    }

}
