package EX1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int thuong = tinhthuong2so(4,0);
        System.out.println("thuong la : "+ thuong);
    }
    private  static int tinhthuong2so(int sothunhat , int sothu2) throws ArithmeticException {
       if(sothu2==0){
           throw new ArithmeticException("Khong chia dc cho 0");
       }else{
           return sothunhat%sothu2;
       }
    }
}
