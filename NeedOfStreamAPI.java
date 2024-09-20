
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NeedOfStreamAPI {
    public static void main(String[] args) {
        // List<Integer>nums=new ArrayList<>();
        // nums.add(4);

        List<Integer> nums = Arrays.asList(5, 36, 7, 8);

        // int sum = 0;
        // for (int n : nums) {
        //     if (n % 2 == 0) {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);
        for(int i =0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int i: nums){
            System.out.println(i);
        }
        nums.forEach(n->System.out.println(n));
        
    }
}
