class Atest extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

class Btest extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {

            
            System.out.println("Hello");
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        
        }
    }

}

public class MultiThread {
    public static void main(String[] args) {
        Atest obj999 = new Atest();
        Btest obj888 = new Btest();


        obj888.start();
        obj999.start();
    }
}
