package DataTypes;

import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        System.out.println(" moi ban nhap vao can nang : ");
        weight = scanner.nextDouble();
        double height;
        System.out.println(" moi ban nhap vao chieu cao :");
        height = scanner.nextDouble();
        tinhChiSoCoThe(weight,height);
    }
    public static void tinhChiSoCoThe(double weight , double height){
      double ibm =  weight*0.45359237 /(height*0.0254*height*0.0254);
        System.out.println("chi so IBM la : " +ibm);
    }
}
