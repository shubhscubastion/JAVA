
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random rand = new Random();
        for (int i = 1; i <= size; i++) {
            nums.add(rand.nextInt(100));
        }
        // System.out.println(nums);

        long startSeq = System.currentTimeMillis();
        int sum = nums.stream()
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e);
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e);
        long endPara = System.currentTimeMillis();

        System.out.println(sum + " " + sum2);
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("Para: " + (endPara - startPara));
    }
}
