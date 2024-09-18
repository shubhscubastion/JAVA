enum Status {
    Running, Failed, Pending, Success;
}

public class EnumExample {
    public static void main(String[] args) {
        // Status s = Status.Success;
        // System.out.println(s);

        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
