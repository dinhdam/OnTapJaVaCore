package DataTypes;

import java.util.Scanner;

public class Ex2InchesMeter {
    public static void main(String[] args) {
        double inches;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao Inches = ");
        inches = scanner.nextDouble();
        doiMeter(inches);
    }

    public static void doiMeter(double soNhapVao) {
        double meter = (soNhapVao / 39.370);
        System.out.println(" meter = " + meter + "(m)");
    }
}
