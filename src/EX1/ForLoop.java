package EX1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int number;
       Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        tinhTongSoChan(number);
    }
    public static void tinhTongSoChan(int soNhapVao){
        int tongSoLe= 0;
        for(int i=0 ; i< soNhapVao; i++){
            if(i%2 !=0){
                System.out.println(" " + i);
                tongSoLe = tongSoLe +i;
            }
        }
        System.out.println(" "+ tongSoLe);

    }
    }



