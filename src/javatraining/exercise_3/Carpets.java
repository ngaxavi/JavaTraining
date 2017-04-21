package javatraining.exercise_3;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class Carpets {

    private static final int SMALL_LARGE = 2;
    private static final int PRICE_FOR_SMALL = 15;
    private static final int PRICE_FOR_LARGE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;
        while (true) {
            System.out.println("Naechster Teppich");
            System.out.print("Lange: ");
            int height = scanner.nextInt();
            if (height == 0) {
                break;
            }
            System.out.print("Breite: ");
            int width = scanner.nextInt();
            if (width == 0) {
                break;
            }
            price += computePrice(width, height);
            System.out.println();
        }
        System.out.println("Preis: " + price + " Euro");
    }

    private static int computePrice(int width, int height) {
        if (width < SMALL_LARGE || height < SMALL_LARGE) {
            return width * height * PRICE_FOR_SMALL;
        } else {
            return width * height * PRICE_FOR_LARGE;
        }
    }
}
