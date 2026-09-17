import java.io.FileNotFoundException;

public class UsingThrow {
    public static void main(String[] args) throws FileNotFoundException {
        int a = 10, b = 0;
        try {
            if (b == 0)
                throw new FileNotFoundException("division by zero");
            else
                System.out.println(a / b);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
