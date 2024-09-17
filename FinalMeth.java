final class Calc99
{
    public void show(){
        System.out.println("in Calc Show ");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

}


// final as a method stops inheritence.
// class AdvCalc extends Calc{

// }


public class FinalMeth {
    public static void main(String[] args){
        Calc99 obj= new Calc99();

        obj.show();
        obj.add(2, 4);
    }
    
}
