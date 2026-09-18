import java.util.*;

public class SetDemo1 {
    public static Set<Integer> noParticipation(Set<Integer> students, Set<Integer> event1,
            Set<Integer> event2) {
        students.removeAll(findAllParticipants(event1, event2));
        return students;
    }

    public static Set<Integer> findAllParticipants(
            Set<Integer> event1,
            Set<Integer> event2) {
        Set<Integer> result = new HashSet<>(event1);
        result.addAll(event2);
        // Write your code
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> Students = new HashSet<>(Arrays.asList(101, 102, 103, 104, 105, 105, 106, 107, 108));
        Set<Integer> event1 = new HashSet<>(Arrays.asList(101, 102, 103));

        Set<Integer> event2 = new HashSet<>(Arrays.asList(103, 104, 105));

        Set<Integer> result = findAllParticipants(event1, event2);
        Set<Integer> result1 = noParticipation(Students, event1, event2);
        System.out.println(result);
        System.out.println("No participation List is " + "\n" + result1);
    }
}
