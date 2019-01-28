package DataTypes;

import java.util.Scanner;

public class Ex1FSangC {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao do F = ");
        fahrenheit = scanner.nextDouble();
        chuyenDoiNhietDo(fahrenheit);
    }

    public static void chuyenDoiNhietDo(double soNhapVao) {
        double celsius = (5 * (soNhapVao - 32.0)) / 9;
        System.out.println(" nhiet do la = " + celsius + " (C)");
    }
}
