class AgeTooLowException extends RuntimeException {
    AgeTooLowException(String msg) {
        super(msg);
    }
}

public class UserDefinedException {
    static int age = 10;

    static void checkAge() throws AgeTooLowException {
        if (age < 18)
            throw new AgeTooLowException("Age is not valid");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge();
        } catch (AgeTooLowException e) {
            System.out.println(e);
        }
    }
}
