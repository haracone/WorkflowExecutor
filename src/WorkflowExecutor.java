import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class WorkflowExecutor {
    private Map <String, String> workflowMap = new HashMap<String, String>();
    private WorkflowFileReader workflowFileReader = null;

    WorkflowExecutor(File workflow) throws FileNotFoundException {
        workflowFileReader = new WorkflowFileReader(workflow);
    }

    void FillingMap() throws IOException {
        String key = "", value = "", str = "";

        workflowFileReader.FindDesc();

        while (!(key.equals("csed")) && !(value.equals("csed"))) {
            key = workflowFileReader.ReadBlockId();
            if (!key.equals("csed")) {
                value = workflowFileReader.ReadBlock();
                workflowMap.put(key, value);
            }
        }
    }

    void Execute() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String number = "";
        Blockable block;
        String str;
        String text = null;
        String[] substr;
        ArrayList <String> arrayList = new ArrayList<>();
        BlockFactory blockFactory = new BlockFactory();

        while (!number.equals("\n")) {
            number = workflowFileReader.ReadBlockId();
            str = workflowMap.get(number);
            substr = str.split("\\s");
            block = blockFactory.CreateBlock(substr[0]);
            text = block.run(substr, text);
        }
    }
}
