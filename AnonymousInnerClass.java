class A {
    public void show() {
        System.out.println("in main show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in the Anonymous Inner Class show");
            }
        };
        obj.show();
    }
}
