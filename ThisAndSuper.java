
class A {


    public A() {
        //every class in java extends a class named Object.
        
        super();
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        // By default super() is always there when a constructor is called.
        // Even when we don't mention it it's there.
        // super()

        super();
        System.out.println("in B");
    }

    public B(int n) {
        super(n);
        System.out.println(" in B Int");
    }

}

public class ThisAndSuper {
    public static void main(String[] args) {
        B example = new B();
    }
}
