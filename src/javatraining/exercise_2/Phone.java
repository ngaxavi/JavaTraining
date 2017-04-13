package javatraining.exercise_2;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Phone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verfuegbare Nummern: ");
        System.out.println("\t 1 \t Susi");
        System.out.println("\t 2 \t Paul");
        System.out.println("\t 3 \t Fritz");
        System.out.println("\t 4 \t Eva");
        System.out.println("\t 5 \t Jan");
        System.out.print("Wen moechtest du anrufen (bitte Zeilennummer eingeben) : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Susis Telefonnummer lautet: (030) 6677190");
                break;
            case 2:
                System.out.println("Pauls Telefonnummer lautet: (030) 6677191");
                break;
            case 3:
                System.out.println("Fritzs Telefonnummer lautet: (030) 6677192");
                break;
            case 4:
                System.out.println("Evas Telefonnummer lautet: (030) 6677193");
                break;
            case 5:
                System.out.println("Jans Telefonnummer lautet: (030) 6677195");
                break;
                default:
                    System.out.println("Fehlerhafte Eingabe");
                    break;
        }
    }
}
