import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        WorkflowExecutor workflowExecutor = new WorkflowExecutor(new File(args[0]));

        workflowExecutor.Execute();
    }
}