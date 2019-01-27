public class FizzBuzz {
    public static void main(String[] args) {
        String message = getMessage(7);
        System.out.println(" "+ message);
    }
    private  static  String getMessage(int number){
        if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }
        if(number%3==0){
            return "Fizz";
        } else if(number%5 ==0) {
            return "Buzz";
        }
        return " khong chia het cho 3 va 5";
    }
}
