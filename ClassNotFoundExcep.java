class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calculator");
    }
}

// Basically it is for not taking respon

public class ClassNotFoundExcep {
    static {
        System.out.println("class Loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
        }

    }
}
