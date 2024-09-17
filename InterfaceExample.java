
interface A {
    // This is equivalent public abstract void show(); as in interface there is
    // already use of abstraction.
    void show();

    void config();

    int age = 44;
    String area = "Mumbai";

    // All variables in interface are final and static
}

// Equivalent to extends but it can have multiple implementations as opposed to
// extend

// class - class -> extends
// class - interface-> implements
// interface-interface -> implements

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,X {
    public void show() {
        System.out.println("check check show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run(){
        System.out.println("Running");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        A obj = new B();

        obj.config();
        obj.show();

        System.out.println(A.age);
    }
}
