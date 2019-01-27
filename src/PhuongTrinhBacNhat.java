import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        int number;
        int number1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so a = ");
        number = scanner.nextInt();
        System.out.println(" nhap vao so b = ");
        number1 = scanner.nextInt();
        tinhPhuongTrinh(number, number1);
    }

    public static void tinhPhuongTrinh(int soNhapVao, int soNhapvao2) {
        if (soNhapVao == 0) {
            if (soNhapvao2 == 0) {
                System.out.println(" phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            float solution = (float) -soNhapvao2 / soNhapVao;
            System.out.println("nghiem cua phuong trinh la " + solution);
        }
    }
}

