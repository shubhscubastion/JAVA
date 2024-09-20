import java.util.logging.Logger;

class Ad {
    public void show() throws ClassNotFoundException {
        // Attempt to load the class dynamically
        Class.forName("Calculator");
    }
}

public class ClassNotFoundExcep {
    private static final Logger LOGGER = Logger.getLogger(ClassNotFoundExcep.class.getName());

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        Ad obj = new Ad();
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
            // Log the exception with a meaningful message
            LOGGER.warning("Class not found: " + ex.getMessage());
        }

        System.out.println("Program completed.");
    }
}
