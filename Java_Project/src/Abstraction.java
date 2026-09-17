public class Abstraction {
    public static void main(String[] args) {
        Payment obj = new UPI();
        // Payment.max_amount=20;
        Payment.display();
        obj.makePayment();
        Payment obj1 = new CreditCard();
        obj1.makePayment();
    }
}

interface Balance {
    int max_balance = 10000;

    void show();
}

interface Payment {
    int max_amount = 10;// public static and final

    void makePayment(); // this method is abstract and public

    static void display() {
        System.out.println("payment successful");
    }
}

class UPI implements Payment, Balance {

    @Override // annotation
    public void makePayment() {
        // TODO Auto-generated method stub
        System.out.println("Payment using UPI");
    }

    public void show()
    {
        System.out.println("Maximum Balance is:"+);
    }
}

class CreditCard implements Payment {
    @Override
    public void makePayment() {
        // TODO Auto-generated method stub
        System.out.println("Payment using Credit Card");
    }
}
