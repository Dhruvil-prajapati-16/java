class myInsuffBalExcp extends Exception {
    public myInsuffBalExcp(String msg) {
        super(msg);
    }
}

public class BankingApplication {
    public static int withdraw(int balc, int amount) throws myInsuffBalExcp {
        if (balc >= amount) {
            balc -= amount;
            System.out.println("Withdrawal of Rs " + amount + " successful.");
            return balc;
        } else {
            throw new myInsuffBalExcp("Not Sufficient Funds.");
        }
    }

    public static void main(String[] args) {
        int balc = 25000;

        try {
            balc = withdraw(balc, 20000);
            balc = withdraw(balc, 4000);
            balc = withdraw(balc, 2000); // This should throw an exception
        } catch (myInsuffBalExcp e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Final balc: Rs " + balc);
    }
}
