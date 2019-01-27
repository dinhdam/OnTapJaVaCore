import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(" day so finbonacci : " + firstNumber);
            firstNumber = secondNumber;
            int res = firstNumber + secondNumber;
            secondNumber = res;
        }
    }
}
