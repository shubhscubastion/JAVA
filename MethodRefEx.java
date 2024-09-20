
import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shubh", "Prashant", "SHiVam");

        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        uNames.forEach(System.out::println);
    }
}
