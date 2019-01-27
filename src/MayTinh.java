import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        int chon = 0;
        boolean isContinue = true;
        String c = "";
        Scanner scanner = new Scanner(System.in);

        do {
            chon = menu(scanner);
            switch (chon){
                case 0:
                    System.out.println("Ban co muon thoat chuong trinh??");
                    isContinue = false;
                    break;
                case 1:
                    System.out.println("Phep Cong");
                    System.out.println("Ban co muon tiep tuc?(Y/n)");
                    c = scanner.next();
                    if(c.toLowerCase().equals("n")){
                        isContinue = false;
                    }

                    break;
                case 2:
                    System.out.println("Phep Tru");
                    System.out.println("Ban co muon tiep tuc?(Y/n)");
                    c = scanner.next();
                    if(c.toLowerCase().equals("n")){
                        isContinue = false;
                    }
                    break;
                case 3:
                    System.out.println("Phep Nhan");
                    System.out.println("Ban co muon tiep tuc?(Y/n)");
                    c = scanner.next();
                    if(c.toLowerCase().equals("n")){
                        isContinue = false;
                    }
                    break;
                case 4:
                    System.out.println("Phep Chia");
                    System.out.println("Ban co muon tiep tuc?(Y/n)");
                    c = scanner.next();
                    if(c.toLowerCase().equals("n")){
                        isContinue = false;
                    }
                default:
                    System.out.println("Chon khong dung, moi ban chon lai!!!");

            }
        }while (isContinue);

    }

    public static int menu(Scanner scanner){
        int chon = 0;
        System.out.println("Menu");
        System.out.println("1.Phep cong");
        System.out.println("2.Phep Tru");
        System.out.println("3.Phep Nhan");
        System.out.println("4.Phep Chia");
        System.out.println("0.Exit");
        System.out.println("Moi ban nhap vao : ");
        chon = scanner.nextInt();
        return chon;
    }


}
