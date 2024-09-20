import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// CollectionAPI -> It is a Concept.
// Collection -> It is an Interface.
// Collections -> It is a Class.

public class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(13);
        nums.add(10);
        nums.add(5);

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(22);

        Set<Integer> digits = new HashSet<Integer>();
        digits.add(3);
        digits.add(9);
        digits.add(30);
        digits.add(39);

        for (int x : digits) {
            System.out.println(x);
        }

        Set<Integer> digitsTree = new TreeSet<Integer>();
        digitsTree.add(3);
        digitsTree.add(9);
        digitsTree.add(30);
        digitsTree.add(39);

        digitsTree.forEach(x -> {
            System.out.println(x);
        });

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        System.out.println(numbers.indexOf(22));
        for (int z : numbers) {
            System.out.println(z);
        }

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
