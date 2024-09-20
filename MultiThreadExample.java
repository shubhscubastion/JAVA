class MultiThreadExample {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10); // Properly handling sleep
                } catch (InterruptedException e) {
                    e.printStackTrace(); // Handle the exception
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10); // Adding sleep for better output interleaving
                } catch (InterruptedException e) {
                    e.printStackTrace(); // Handle the exception
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // Start thread A
        t2.start(); // Start thread B
    }
}
