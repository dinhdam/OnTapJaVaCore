import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
     int n;
     Scanner scanner = new Scanner(System.in);
     n = scanner.nextInt();
     if(isPrime(n)){
         System.out.println("n la so nguyen to!!!");
     }else{
         System.out.println("n khong phai so nguyen to!!!! ");
     }
    }
    private static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number%i ==0){
                return false;
            }
        }
       return true;

    }
}
