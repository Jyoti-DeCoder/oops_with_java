class BankAccount {

    private int balance = 500;

    synchronized void withdraw(int amount) {

        System.out.println(
                Thread.currentThread().getName()
                        + " is trying to withdraw " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Balance: " + balance);
    }

    synchronized void deposit(int amount) {
        // Thread.sleep(1000);
        System.out.println(
                Thread.currentThread().getName()
                        + " is depositing " + amount);

        balance = balance + amount;

        System.out.println("Deposit successful");
        System.out.println("Balance: " + balance);

        notify();
    }
}

// Thread for withdrawal
class WithdrawThread implements Runnable {

    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

// Thread for deposit
class DepositThread implements Runnable {

    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

public class SyncronizedThread {

    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount();

        WithdrawThread w = new WithdrawThread(account);
        DepositThread d = new DepositThread(account);

        Thread thread1 = new Thread(w, "Customer");
        Thread thread2 = new Thread(d, "Bank");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}