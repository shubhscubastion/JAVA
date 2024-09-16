public class MultidimensionalArray {
    public static void main(StringEx[] args) {
        int nums[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

}
