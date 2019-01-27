public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear = findLeapYear(2009);
        if(isLeapYear== true){
            System.out.println(" day la nam nhuan");
        } else if(isLeapYear == false){
            System.out.println("day khong phai nam nhuan");
        }

    }
    public  static boolean findLeapYear(int year){
        if(year%4==0 && year%100==0) {
            return true;
        }else {
           if(year% 4 != 0 || year%100!= 0){
               return false;
           }
        }
        return false;
    }

}
