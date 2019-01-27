import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("so nguyen to nho hon 100 :");
        for (int i = 0; i <100 ; i++) {
            if(isPrime(i)){
                System.out.print(" " +i);
            }
        }
    }
    private static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i=2 ;i <= Math.sqrt(number);i++){
            if(number%i ==0){
                return false;

            }
        }
        return true;
    }

}
