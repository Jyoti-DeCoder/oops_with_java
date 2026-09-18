import java.util.*;

public class ArrayListDemo {

    public static void addMarks(List<Integer> marks, int mark) {
        // Write your codema
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        // Write your code
        double sum = 0;
        Iterator<Integer> i = marks.iterator();
        while (i.hasNext()) {
            sum = sum + i.next();
        }

        return sum / marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        // Write your code
        int highest = marks.get(0);

        Iterator<Integer> i = marks.iterator();

        while (i.hasNext()) {
            int mark = i.next();

            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    public static void displayMarks(List<Integer> marks) {
        // Write your code
        Iterator<Integer> i = marks.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}
