import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        inCacSo(number);
    }
    public static  void inCacSo(int soNhapVao){

        if(soNhapVao>=0 && soNhapVao<= 9){
            switch (soNhapVao){
                case 1 :
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                    default:
                        System.out.println("khong in ra gi");

            }
        }
        }

    }

