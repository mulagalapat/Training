public class SumOfDigitsDemo {
    int sumDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfDigitsDemo obj = new SumOfDigitsDemo();
        System.out.println("Sum of digits of 1234: " + obj.sumDigits(1234));
    }
}