package javatraining.exercise_2;

import java.util.Scanner;

/**
 * @author Xavier Ngansop
 */
public class AlarmClock {

    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_DAY = HOURS_PER_DAY * MINUTES_PER_HOUR;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aktuelle Uhrzeit (Stunde): ");
        int nowHour = scanner.nextInt();
        System.out.print("Aktuelle Uhrzeit (Minute): ");
        int nowMinute = scanner.nextInt();
        System.out.print("Weckzeit (Stunde): ");
        int alarmHour = scanner.nextInt();
        System.out.print("Weckzeit (Minute): ");
        int alarmMinute = scanner.nextInt();

        int nowInMinutes = nowHour * MINUTES_PER_HOUR + nowMinute;
        int alarmInMinutes = alarmHour * MINUTES_PER_HOUR + alarmMinute;
        int timeToSleep;
        if (alarmInMinutes < nowInMinutes) {
            timeToSleep = MINUTES_PER_DAY - nowInMinutes + alarmInMinutes;
        } else {
            timeToSleep = alarmInMinutes - nowInMinutes;
        }

        System.out.println("Du kannst noch " + timeToSleep + " Minuten schlafen.");
    }
}
