package javatraining.exercise_2;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class FairBears {

    private static final int NUMBER_PERSONS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl rote: ");
        int redBears = scanner.nextInt();

        System.out.print("Anzahl gelbe: ");
        int yellowBears = scanner.nextInt();


        int susiRedBears, susiYellowBears = 0,
                fredRedBears, fredYellowBears = 0,
                paulRedBears, paulYellowBears = 0;


        susiRedBears = fredRedBears = paulRedBears = redBears / NUMBER_PERSONS;

        switch (redBears % NUMBER_PERSONS) {
            case 1:
                susiRedBears++;
                if (yellowBears >= 2) {
                    fredYellowBears++;
                    paulYellowBears++;
                    yellowBears -= 2;
                } else if (yellowBears == 1) {
                    fredYellowBears++;
                    yellowBears--;
                }
                break;
            case 2:
                susiRedBears++;
                fredRedBears++;
                if (yellowBears >= 1) {
                    paulYellowBears++;
                    yellowBears--;
                }
        }

        susiYellowBears += yellowBears / NUMBER_PERSONS;
        fredYellowBears += yellowBears / NUMBER_PERSONS;
        paulYellowBears += yellowBears / NUMBER_PERSONS;

//        if (yellowBears % NUMBER_PERSONS == 1) {
//            susiYellowBears++;
//        } else if (yellowBears % NUMBER_PERSONS == 2) {
//            susiYellowBears++;
//            fredYellowBears++;
//        }


        switch (yellowBears % NUMBER_PERSONS) {
            case 2:
                fredYellowBears++;
            case 1:
                susiYellowBears++;
        }

        System.out.println("Susi erhaelt " + susiRedBears + " rote und " + susiYellowBears + " gelbe Gummibaerchen.");
        System.out.println("Fred erhaelt " + fredRedBears + " rote und " + fredYellowBears + " gelbe Gummibaerchen.");
        System.out.println("Paul erhaelt " + paulRedBears + " rote und " + paulYellowBears + " gelbe Gummibaerchen.");

    }
}
