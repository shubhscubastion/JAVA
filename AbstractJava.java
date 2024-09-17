
// Few points to remember, The abstract class should be mentioned and the method should also 
// have it mentioned that it is abstract, The abstract method should be defined in the child class
// cannot create object of an abstract class.
abstract class Car {
    public abstract void drive();

    public void playMusic(){
        System.out.println("starts playing music!");
    }
}

class Swift extends Car{
    public void drive(){
        System.out.println("Can drive!!");
    }
}

public class AbstractJava {
    public static void main(String[] args) {
        Car WagonR= new Swift();

        WagonR.drive();
        WagonR.playMusic();
    }
}
