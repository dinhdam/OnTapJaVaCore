public class Effect {
    public static void main(String[] args) {
        int res = tinhHieuHaiSo(6,5);
        System.out.println(" hieu cua hai so la = "+ res);
        int resl = tinhTongHaiSo(7,8);
        System.out.println(" tong hai so la = "+ resl);
        int kq = tinhTichHaiSo();
        System.out.println(" tich cua hai so = "+kq);
    }
    public static int tinhHieuHaiSo(int x , int y){
        int res =  x - y;
        return res;
    }
    public static int tinhTongHaiSo(int fistNumber, int secondNumber){
        int resl = fistNumber + secondNumber;
        return resl;
    }
    public  static int tinhTichHaiSo(){
        int number = 15;
        int number1 = 2;
        int kq = number * number1;
        return  kq;
    }
}
