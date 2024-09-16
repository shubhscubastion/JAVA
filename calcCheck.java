public class calcCheck {
    public static void main(String[] args) {
        AdvCalc updcalc = new AdvCalc();

        int r1 = updcalc.Addi(5, 8);
        int r2 = updcalc.multi(5, 6);

        System.err.println(r1 + " : " + r2);
    }
}
