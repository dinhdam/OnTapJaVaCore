package EX1;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        int fisrtNumber;
        int secondNumber;
        int threeNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so a = ");
        fisrtNumber = scanner.nextInt();
        System.out.println(" nhap vao so b = ");
        secondNumber = scanner.nextInt();
        System.out.println("nhap vao so c = ");
        threeNumber = scanner.nextInt();
        phuongTrinhBacHai(fisrtNumber,secondNumber,threeNumber);

    }

    public static void phuongTrinhBacHai(int nhapSoThuNhat, int nhapSoThuHai, int nhapSoThuBa) {
        if (nhapSoThuNhat == 0) {
            if (nhapSoThuHai == 0) {
                System.out.println("truong hop vo nghiem");
            } else {
                System.out.println("truong hop co mot nghiem" + "x =" + -nhapSoThuHai / nhapSoThuBa);
            }
        }
        //truong hop delta
        float delta = nhapSoThuHai * 2 - 4 * nhapSoThuNhat * nhapSoThuBa;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float)(-nhapSoThuHai + Math.sqrt(delta))/(2*nhapSoThuNhat);
            x2 = (float)(-nhapSoThuHai + Math.sqrt(delta))/(2* nhapSoThuNhat);
            System.out.println("Phuong trinh co 2 nghiem la :"+ "x1 = " +x1 +", x2= "+x2);
        }
        else if (delta==0){
            x1 = (float)(-nhapSoThuHai)/(2*nhapSoThuNhat);
            x2 = (float)(-nhapSoThuHai)/(2*nhapSoThuNhat);
            System.out.println(" phuong trinh co 2 nghiem la :" +" x1 = " + x1 + ", x2= " + x2);
        }
        else {
            System.out.println( " phuong trinh vo nghiem");
        }
    }
}

