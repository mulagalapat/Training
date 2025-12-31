public class LargestNumberDemo {
        int largest(int a, int b, int c) {
            int max = a;
            if(b > max) {
                max = b;
            }
            if(c > max) {
                max = c;
            }

            return max;
        }

        public static void main(String[] args) {
            LargestNumberDemo obj = new LargestNumberDemo();
            System.out.println("Largest: " + obj.largest(10, 25, 15));
    }
}
