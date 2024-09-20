import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args){
        List<String> names= Arrays.asList("Shubh", "Prashant", "Shivam", "Shyam", "Ayushi");

        Optional <String> name = names.stream()
                                    .filter(str->str.contains("a"))
                                    .findFirst();
                                    // .orElse("Not Found");

        System.out.println(name.orElse("Not Found"));
    }
}
