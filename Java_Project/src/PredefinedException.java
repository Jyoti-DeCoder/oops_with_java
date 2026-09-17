import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PredefinedException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = { 1, 2, 3, 4 };
            int i, b;
            FileReader fr = new FileReader("abc.txt");
            i = sc.nextInt();
            b = sc.nextInt();
            System.out.println(arr[i]);
            System.out.println(arr[i] / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught is " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excetion caught is " + e.getMessage());
        } catch (Exception e) {
            // System.out.println("file not found");
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("finally executed");
        }
    }
}
