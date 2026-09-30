import java.util.*;

public class HashDemo {

    public static void main(String[] args) {

        HashMap<Integer, Integer> marks = new HashMap<>();

        // Adding student marks
        marks.put(101, 85);
        marks.put(102, 92);
        marks.put(103, 76);
        marks.put(104, 88);
        marks.put(105, 95);

        // Display all students
        System.out.println("Student Marks:");

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            System.out.println(
                    "Roll No: " + entry.getKey() +
                            ", Marks: " + entry.getValue());
        }

        // Search marks
        int rollNo = 103;

        if (marks.containsKey(rollNo)) {
            System.out.println(
                    "\nMarks of Roll No " + rollNo +
                            ": " + marks.get(rollNo));
        } else {
            System.out.println("\nStudent not found");
        }

        // Update marks
        marks.put(103, 82);

        System.out.println(
                "\nUpdated marks of Roll No 103: "
                        + marks.get(103));

        // Remove student
        marks.remove(105);

        System.out.println("\nAfter removing Roll No 105:");

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            System.out.println(
                    "Roll No: " + entry.getKey() +
                            ", Marks: " + entry.getValue());
        }
    }
}