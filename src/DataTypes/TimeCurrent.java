package DataTypes;

import java.util.Scanner;

public class TimeCurrent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeZoneChange = scanner.nextInt();

        long totalMilliseconds = System.currentTimeMillis();//moc thoi gian may tinh 01/01/1970 00h:00p:00s

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour +":" + currentMinute + ":" + currentSecond);

    }
}
