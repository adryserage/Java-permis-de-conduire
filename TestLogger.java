import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestLogger {
    private static final String LOG_FILE = "test_execution.log";
    private static PrintWriter writer;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static {
        try {
            writer = new PrintWriter(new FileWriter(LOG_FILE, true));
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier de log: " + e.getMessage());
        }
    }

    public static void logInfo(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logMessage = String.format("[%s] INFO: %s", timestamp, message);
        System.out.println(logMessage);
        writer.println(logMessage);
        writer.flush();
    }

    public static void logError(String message, Exception e) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logMessage = String.format("[%s] ERROR: %s - %s", timestamp, message, e.getMessage());
        System.err.println(logMessage);
        writer.println(logMessage);
        writer.flush();
    }

    public static void logTestResult(String testName, boolean success) {
        String timestamp = LocalDateTime.now().format(formatter);
        String result = success ? "SUCCÈS" : "ÉCHEC";
        String logMessage = String.format("[%s] TEST %s: %s", timestamp, result, testName);
        System.out.println(logMessage);
        writer.println(logMessage);
        writer.flush();
    }

    public static void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
