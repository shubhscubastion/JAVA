public class JaggedArray {
    public static void main(StringEx[] args) {
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];
        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                num[j] = (int) (Math.random() * 10);
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }

    }
}
