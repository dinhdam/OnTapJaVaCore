package IsPrime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            if(isPrime(i)){
                System.out.println( " so nguyen to la = " + i);
            }
        }

    }
    private static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

}
