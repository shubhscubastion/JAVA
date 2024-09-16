class MethodsComp {
    public void Music() {
        System.out.println("well this is method 1 for playing music");
    }

    public String getMeAPen(int cost) {
        if (cost <= 1) {
            return "Less or equal 1";
        } else
            return "Greater";
    }
}

public class Method {
    public static void main(String args[]) {
        MethodsComp comp1 = new MethodsComp();
        comp1.Music();

        String str = comp1.getMeAPen(2);
        System.out.println(str);

    }

}