class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class Demo {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        int result = calc1.add(1, 2, 3);
        System.out.println(result);
    }
}