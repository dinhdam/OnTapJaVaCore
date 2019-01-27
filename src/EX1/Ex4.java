package EX1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int result;
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        System.out.println("Enter first :");
        secondNumber = scanner.nextInt();
        System.out.println("Enter sencond :");
        thirdNumber = scanner.nextInt();
        System.out.println("Enter third :");
        result = firstNumber + secondNumber * thirdNumber;
        System.out.println(" result =" + result);

    }
}
