class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A obj = new B(); // Create object of class B, reference of class A
        obj.show(); // This will call B's overridden show() method
    }
}
