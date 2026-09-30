import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return rollNo + " " + name + " " + marks;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.marks != o2.marks) {
            return o2.marks - o1.marks;
        }
        return o1.rollNo - o2.rollNo;
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        // TODO Auto-generated method stub
        return o2 - o1;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o2.name.compareTo(o1.name);
    }
}

public class Comparatordemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(50);
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(10, "Rahul", 100));
        st.add(new Student(9, "Ritesh", 90));
        st.add(new Student(5, "Ritika", 100));
        st.add(new Student(20, "Meetesh", 80));
        st.add(new Student(11, "Shristi", 70));
        a.sort(null);
        a.sort(new CustomComparator());
        st.sort(new StudentComparator());
        System.out.println(st);
        st.sort(new NameComparator());//

        Collections.sort(st, new NameComparator());
        System.out.println(st);
    }
}
