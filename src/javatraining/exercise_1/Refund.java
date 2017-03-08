package javatraining.exercise_1;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Refund {

    private static final int NUMBER_OF_BOTTLE_IN_CRATE = 9;
    private static final int BOTTLE_COST = 20;
    private static final int CRATE_COST = 500;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl zurueckgegebener voller Kisten: ");
        int fullCrates = scanner.nextInt();


        System.out.print("Anzahl zurueckgegebener Einzelflaschen: ");
        int emptyBottles = scanner.nextInt();

        int result = fullCrates * CRATE_COST +
                (emptyBottles + (fullCrates * NUMBER_OF_BOTTLE_IN_CRATE)) * BOTTLE_COST;

        System.out.println("Sie erhalten " + result + " Cent.");

    }
}
