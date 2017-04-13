package javatraining.exercise_2;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Middle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte 3 voneinander verschiedene Zahlen eingeben: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        System.out.print("Die mittlere Zahl ist ");

        if (firstNum > secondNum) {
            if (firstNum < thirdNum) {
                System.out.print(firstNum);
            } else if (secondNum < thirdNum) {
                System.out.print(thirdNum);
            } else {
                System.out.print(secondNum);
            }
        } else {
            if (secondNum < thirdNum) {
                System.out.print(secondNum);
            } else if (firstNum < thirdNum) {
                System.out.print(thirdNum);
            } else {
                System.out.print(firstNum);
            }
        }
    }
}


