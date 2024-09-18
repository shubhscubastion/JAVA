public class ExceptionHandling {

    public static void main(String[] args) {
        int i = 0; // This will cause division by zero
        int j = 0;

        int nums[] = new int[5];

        try {
            // This will throw ArithmeticException due to division by zero
            j = 18 / i;

            // This will not be executed
            System.out.println(nums[1]);

            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        // This line will not be executed due to the exception
        System.out.println(j);
        System.out.println("Bye");
    }
}
