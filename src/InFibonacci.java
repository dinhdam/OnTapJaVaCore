import java.util.Scanner;

public class InFibonacci {
    public static void main(String[] args) {
        int number;
    Scanner scanner = new Scanner(System.in);
      number =scanner.nextInt();
      inRaFibonacci(number);
    }
    public static void inRaFibonacci(int rel){
        int soThuNhat =1;
        int soThuHai =1;
        for (int i = 0; i <rel ; i++) {
            System.out.println(" "+ soThuNhat);
            int kq = soThuNhat + soThuHai;
                soThuNhat = soThuHai;
                soThuHai = kq;
            if(soThuNhat>=rel){
                break;
            }
        }
    }

}
