package BaiTapVongFor;

import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        bangCuuChuong(number);
    }

    public static void bangCuuChuong(int soNhapVao) {
        for (int i = 0; i < 10; i++) {
            System.out.println(soNhapVao + "x" + (i + 1) + " = " + (soNhapVao * (i + 1)));

        }
    }
}
