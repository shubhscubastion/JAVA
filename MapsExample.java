import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new Hashtable<>();

        students.put("Shubh", 1);
        students.put("Prashant", 4);
        students.put("Shivam", 7);
        students.put("Shyaam", 8);

        System.out.println(students.values());
        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
