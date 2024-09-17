abstract class A {

    public abstract void some();

    public void show() {
        System.out.println("in show");
    }
}

// class B extends A{
// public void some(){
// System.out.println("in some AnonymousInnerClass");
// }
// }

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A() {
            public void some() {
                System.out.println("This is the inner class abstract some");
            }
        };

        obj.some();

    }
}
