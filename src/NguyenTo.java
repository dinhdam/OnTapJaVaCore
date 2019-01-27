import java.util.Scanner;

public class NguyenTo {
    public static void main(String[] args) {
        System.out.println(" in ra tong cac chu so :");
        int tongso = 0;
        for (int i = 0; i < 10; i++) {
            if (sumPrime(i)) {
                tongso = tongso + i;
                System.out.print(" " + i);
            }
        }
        System.out.println("tong la : " + tongso);
    }

    public static boolean sumPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
