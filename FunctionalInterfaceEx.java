@FunctionalInterface
interface A{
    void show(int i);
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };

        A obj =(i)->System.out.println("in Show" + i);
        obj.show(5);
    }
}
