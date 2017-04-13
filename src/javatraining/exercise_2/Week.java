package javatraining.exercise_2;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Week {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Tag eingeben: ");
        int day = scanner.nextInt();

        System.out.print("Bitte Monat eingeben: ");
        int month = scanner.nextInt();

        int nextWeekDay = day + 7;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                month = nextWeekDay > 31 ? (month + 1) % 12 : month;
                day = nextWeekDay % 31;
                break;

            case 2:
                month = nextWeekDay > 28 ? month + 1 : month;
                day = nextWeekDay % 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                month = nextWeekDay > 30 ? (month + 1) % 12 : month;
                day = nextWeekDay % 30;
                break;

            default:
                System.out.println("Monat muss innerhalb von 1 bis 12 definiert.");
        }

        System.out.println("Naechster Termin: " + day + "." + month + ".");
    }
}
