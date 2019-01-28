package DataTypes;

import java.util.Scanner;

public class Ex3ChuyenDoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mimutes = ");
        double min = scanner.nextDouble();
        convertMimutesIntoOffDay(min);
    }
    public static void convertMimutesIntoOffDay(double min){
        double mimutes = 60 *24*365;
        int day = (int)(min/60/24)% 360;
        double year = (double)(min/mimutes);
        System.out.println((int)min + " phut  " +"," + day + " ngay  " + ","+ year + "  nam ");
    }
}
