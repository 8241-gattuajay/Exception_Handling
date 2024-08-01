public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(int amount) {
        super(String.valueOf(amount));
    }
}
