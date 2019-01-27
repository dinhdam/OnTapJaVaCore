package EX1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        number = scanner.nextInt();
        bangCuuChuong(number);
    }
    public static void bangCuuChuong(int soNhapVao){
        for( int i = 1 ; i <= 10 ;i++){
            System.out.println( soNhapVao + "x" + i + "=" +(i* soNhapVao));
        }
    }
}
