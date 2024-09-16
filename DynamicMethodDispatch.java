class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    // B inherits the show() method from A
    // B can also override show() if needed
    public void show(){
        System.out.println("in B show");
    }
}

class C extends B{
    public void show(){
        System.out.println("in C show");
    }
}

// Uncommenting the following class would also be valid
// class C extends A {
// // C would inherit the show() method from A as well
// }

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Creating an object of class B
        // B obj = new B();

        // You can also create a superclass reference to a subclass object
        // A obj = new B(); // This is valid and demonstrates polymorphism

        // Calling the show method on the B object
        // Since B does not override show(), the method in A will be called
        // obj.show(); // Output: in A show
        A obj = new A();
        obj.show();

        // This will only work when inheritence is there. If it is not there then it wont work.

        obj = new B();
        obj.show();

        obj= new C();
        obj.show();

    }
}
