package BaiTapVongFor;

import java.util.Scanner;

public class CricleSC {
    public static void main(String[] args) {
       double radius;
        Scanner scanner = new Scanner(System.in);
        radius= scanner.nextDouble();
        tinhChuVi(radius);
        tinhDienTich(radius);
    }
    public static void tinhChuVi( double banKinh){
        double chuVi = banKinh *2 * Math.PI;
        System.out.println("chu vi hinh tron la = " + chuVi);
    }
    public static void tinhDienTich(double bankinh){
        double dienTich = bankinh*bankinh *Math.PI;
        System.out.println("dien tich hinh tron la = " + dienTich);
    }
}
