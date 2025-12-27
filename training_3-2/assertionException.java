public class assertionException {
    public static void main(String[] args) {
        int balance = 2000;
        assert balance >= 1000 : "Minimum balance not maintained";
        System.out.println("Account is valid");
    }
}
