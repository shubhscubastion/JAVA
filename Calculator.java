class Check {
    public int Addi(int n1, int n2) {
        return n1 + n2;
    }
}

public class Calculator {
    public static void main(StringEx[] args) {
        Check check1 = new Check();
        int result = check1.Addi(1, 2);
        System.out.println(result);
    }
}
