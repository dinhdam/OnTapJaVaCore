package BaiTapVongFor;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int firstNumber ;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu 1: ");
        firstNumber = scanner.nextInt();
        System.out.println(" nhap vao so thu 2 : ");
        secondNumber = scanner.nextInt();
        hoanDoiHaiSo(firstNumber,secondNumber);
    }
    public static void hoanDoiHaiSo(int number , int number1){
        int temp;
        temp = number;
        number = number1;
        number1 = temp;
        System.out.println("After swapping : number, number1 = "+ number+", "+ + number1);

    }

}
