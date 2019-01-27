package BaiTapVongFor;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int fisrtNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu 1 :");
        fisrtNumber = scanner.nextInt();
        System.out.println("nhap vao so thu 2  :");
        secondNumber = scanner.nextInt();
        hoanDoiHaiSo(fisrtNumber,secondNumber);
    }
    public static void hoanDoiHaiSo(int soThuNhat, int soThuHai){
        soThuNhat = soThuNhat + soThuHai;
        soThuHai = soThuNhat -soThuHai;
        soThuNhat = soThuNhat- soThuHai;
        System.out.println("After Swap number ,number2 = " + soThuNhat + "," + soThuHai);
    }
}
