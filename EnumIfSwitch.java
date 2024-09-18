enum Status{
    Running, Failed, Pending, Success;
}

public class EnumIfSwitch {
    public static void main(String[] args) {
        Status s = Status.Success;

        switch (s) {
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Done");
        
            default -> {
            }
        }
    }
}
