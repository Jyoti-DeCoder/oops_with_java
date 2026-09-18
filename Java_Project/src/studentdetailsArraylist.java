import java.util.*;

//Student collection with exception handling
public class studentdetailsArraylist {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();
        try {
            li.add(new Student("A", 1, 20));
            li.add(new Student("B", 2, 50));
            li.add(new Student("C", 3, 40));
            li.add(new Student("D", 4, -20)); // negative numbers not allowed
        } catch (InvalidMarksException e) {
            System.out.println(e);
        }
        System.out.println("\nStudent Details:");

        for (Student s : li) {
            s.display();
        }
    }
}

class Student {
    String name;
    int rollno;
    int tmarks;

    Student(String n, int r, int t) throws InvalidMarksException {
        if (t < 0)
            throw new InvalidMarksException("marks can not be negative");
        name = n;
        rollno = r;
        tmarks = t;
    }

    void display() {
        System.out.println("name is " + name + " roll no is " + rollno + " marks is " + tmarks);

    }
}

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}
