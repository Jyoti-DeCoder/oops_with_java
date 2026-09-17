public class Usecase4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;
        try {
            withdraw(balance, withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        } finally {
            System.out.println("Transaction attempt completed.");
        }

        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException, ArithmeticException/*
                                                                                                                 * complete
                                                                                                                 * signature
                                                                                                                 */ {
        // TODO: throw InsufficientBalanceException if amount > balance
        // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
        if (balance < amount)
            throw new InsufficientBalanceException("balance is insufficient");
        System.out.println("withdrawal succesful with balance" + (balance - amount));
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
