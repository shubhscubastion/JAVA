class Human {
    // int age;
    // String name;

    // private int age = 19;
    // private String name = "Shubh";

    private int age;
    private String name;
    private int rollNo;

    // Constructor is always named the same as the class
    public Human() {
        age = 12;
        name = "Raju";
        rollNo = 001;
    }

    // Parameterised constructor
    public Human(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Human newHuman = new Human();
        // newHuman.age = 11;
        // newHuman.name = "Someone";
        newHuman.setAge(20);
        newHuman.setName("Someone");
        newHuman.setRollNo(2000);

        // By default if we dont set age name
        // rollno then the constructor will be called

        System.out.println(newHuman.getAge());
        System.out.println(newHuman.getName());
        System.out.println(newHuman.getRollNo());

    }
}
