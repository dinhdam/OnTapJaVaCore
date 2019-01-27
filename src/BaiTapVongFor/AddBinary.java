package BaiTapVongFor;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        long binary1;
        long binary2;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so nhi phan thu nhat = ");
        binary1 = scanner.nextLong();
        System.out.println(" nhap vao so nhi phan thu  hai =  ");
        binary2 = scanner.nextLong();
        congHaiSoNhiPhan(binary1,binary2);
    }

    public static void congHaiSoNhiPhan(long number, long number2) {
        int i = 0;
        int bienNho = 0;
        int[] sum = new int[20];
        while (number != 0 || number2 != 0) {
            sum[i++] = (int) ((number % 10 + number2 % 10 + bienNho) % 2);
            bienNho = (int) ((number % 10 + number2 % 10 + bienNho) / 2);
            number = number / 10;
            number2 = number2 / 10;
        }
        if (bienNho != 0) {
            sum[i++] = bienNho;
        }
       --i;
        System.out.println("tong cua 2 so nhi phan la =");
        while (i>=0){
            System.out.println(sum[i--]);
        }

    }

}
