package BaiTapVongFor;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int fisrtNumber;
        int secondNumber;
        int threeNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so thu 1 :");
        fisrtNumber = scanner.nextInt();
        System.out.println("nhap vao so thu 2 :");
        secondNumber = scanner.nextInt();
        System.out.println("nhap vao so thu 3 :");
        threeNumber = scanner.nextInt();
        tinhTrungBinh(fisrtNumber, secondNumber, threeNumber);
    }

    public static void tinhTrungBinh(int number, int number2, int number3) {
        int trungBinhCong = (number + number2 + number3) / 3;
        System.out.println("Trung binh cong cua 3 so la = " + trungBinhCong);
    }
}
