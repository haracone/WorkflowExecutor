import java.io.File;
import java.io.IOException;
import java.util.logging.LogManager;

public class Main {

    public static void main(String[] args) {
        WorkflowExecutor workflowExecutor = null;

        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/log.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        try {
            workflowExecutor = new WorkflowExecutor(new File(args[0]));
            workflowExecutor.Execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}