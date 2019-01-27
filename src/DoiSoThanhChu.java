import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        soThanhChu(number);
    }
    public static void soThanhChu(int soNhapVao){

        switch (soNhapVao){
          case 1:
              System.out.println("so mot");
              break;
          case 2:
              System.out.println("so hai");
              break;
            case 3:
                System.out.println("so ba");
                break;
            case 4:
                System.out.println("so bon");
                break;
            case 5:
                System.out.println("so nam");
                break;
            case 6:
                System.out.println("so sau");
                break;
            case 7:
                System.out.println("so bay");
                break;
            case 8:
                System.out.println("so tam");
                break;
            case 9:
                System.out.println("so chin");
                break;
            case 10:
                System.out.println("so muoi");
                break;
              default:
                  System.out.println(" may la con ga");
      }
    }
}
