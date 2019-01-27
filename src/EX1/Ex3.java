package EX1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int result;
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        System.out.println("Enter firstNumber");
        secondNumber = scanner.nextInt();
        System.out.println("Enter secondNumber");
        result = firstNumber +secondNumber;
        System.out.println("result =" + result);
    }
}
