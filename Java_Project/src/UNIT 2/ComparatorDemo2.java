import java.util.*;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.rollno - o2.rollno;
    }
}

class Student {

    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " " + rollno + " " + marks + "";
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("rahul", 1, 100));
        st.add(new Student("Nitesh", 10, 20));
        st.add(new Student("Neetesh", 7, 80));
        st.add(new Student("Nilesh", 9, 70));
        st.add(new Student("Mitesh", 20, 80));

        st.sort(new StudentComparator());

        System.out.println(st);
    }
}
