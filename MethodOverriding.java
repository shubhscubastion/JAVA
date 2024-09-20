class Ae {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class Be extends Ae {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Ae obj = new Be(); // Create object of class B, reference of class A
        obj.show(); // This will call B's overridden show() method
    }
}
