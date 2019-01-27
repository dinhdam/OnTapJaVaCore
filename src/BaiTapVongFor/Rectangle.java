package BaiTapVongFor;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double lenght;
        double width;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chieu dai : ");
        lenght = scanner.nextDouble();
        System.out.println(" nhap vao chieu rong : ");
        width = scanner.nextDouble();
        tinhChuVi(lenght,width);
        tinhDienTich(lenght,width);
    }

    public static void tinhChuVi(double chieuRong,double chieuDai){
        double chuVi = 2*(chieuDai + chieuRong);
        System.out.println(" Chu vi hinh chu nhat la = " +chuVi);
    }
    public static void tinhDienTich( double chieuRong , double chieuDai){
        double dienTich = chieuDai * chieuRong;
        System.out.println(" Dien tic hinh chu nhat la = "+ dienTich);
    }
}
