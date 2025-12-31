public class MethodsDemo {
        int add(int a, int b){
            int c = a+b;
            return c;
        }
        public static void main(String[] args) {
            MethodsDemo obj = new MethodsDemo();
            int result = obj.add(10, 20);
            System.out.println(result);

    }
}
