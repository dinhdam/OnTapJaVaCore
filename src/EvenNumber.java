import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        tinhTongSoChan(number);
    }
    public static void tinhTongSoChan(int soNhapVao){
        int tongSoChan = 0;
        for(int i = 0 ; i< soNhapVao; i++){
            if(i%2==0){
                tongSoChan+= i;
            }
        }
        System.out.println(" "+ tongSoChan);
    }
}
