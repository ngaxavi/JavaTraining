package javatraining.exercise_3;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class BestDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Basiszahl ein: ");
        double basePoint = scanner.nextDouble();

        double bestDistance = 0;
        double bestPoint = 0;
        int bestPointPosition = 0;
        boolean atLeastOneInput = false;

        for (int i = 1; true; i++) {
            System.out.print("Geben Sie eine Zahl ein: ");
            double point = scanner.nextDouble();

            if (point == -1) {
                break;
            }

            if (distance(basePoint, point) < bestDistance || !atLeastOneInput) {
                bestPoint = point;
                bestPointPosition = i;
                bestDistance = distance(basePoint, point);
                atLeastOneInput = true;
            }
        }

        if (atLeastOneInput) {
            System.out.println("Die " + bestPointPosition + ". Zahl mit dem Wert " + bestPoint + " ist am naechsten dran.");
        } else {
            System.out.println("Es wurde keine Vergleichzahl angegeben.");
        }

    }

    private static double distance(double point1, double point2) {
        return absoluteValue(absoluteValue(point1) - absoluteValue(point2));
    }

    private static double absoluteValue(double value) {
        return value >= 0 ? value : -value;
    }
}
