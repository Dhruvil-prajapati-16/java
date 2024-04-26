class DivideException extends Exception {
    public DivideException() {
        super("Division by zero attempted");
    }

    public DivideException(String message) {
        super(message);
    }
}

public class Divide {

    public static int divide(int numerator, int denominator) throws DivideException {
        if (denominator == 0) {
            throw new DivideException("Attempted to divide  by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
