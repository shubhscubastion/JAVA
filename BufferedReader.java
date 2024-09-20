
import java.io.IOException;
import java.util.Scanner;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, please enter a number!");
        // int num =System.in.read(num);

        // System.out.println(num);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        
    }

}
