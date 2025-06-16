public class Main {
    public static void main(String[] args) {
        // Get the logger instance multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use logger
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Different logger instances exist (Singleton failed).");
        }
    }
}
