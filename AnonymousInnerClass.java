class Ac {
    public void show() {
        System.out.println("in main show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Ac obj = new Ac() {
            public void show() {
                System.out.println("in the Anonymous Inner Class show");
            }
        };
        obj.show();
    }
}
