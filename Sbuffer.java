public class Sbuffer {
    public static void main(String[] args) {
        StringBuffer sbexample = new StringBuffer("Shubh ");
        sbexample.append("Sarpal");
        sbexample.insert(6, "Real ");
        sbexample.setLength(30);
        sbexample.ensureCapacity(100);
        System.out.println(sbexample);
    }
}
