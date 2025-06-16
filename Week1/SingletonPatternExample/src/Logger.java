public class Logger {
    // Step 1: Private static instance
    private static Logger instance;

    // Step 2: Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // A simple method to simulate logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
