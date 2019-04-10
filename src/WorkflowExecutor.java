import Blocks.BlockFactory;
import Blocks.Blockable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

class WorkflowExecutor {
    private Map <String, String> workflowMap = new HashMap<>();
    private WorkflowFileReader workflowFileReader = null;

    WorkflowExecutor(File workflow) throws IOException {
        workflowFileReader = new WorkflowFileReader(workflow);
    }

    private void FillingMap() throws IOException {
        String key = "", value = "";

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
        String number = "0";
        Blockable block;
        String str;
        String text = null;
        String[] substr;
        BlockFactory blockFactory = new BlockFactory();

        FillingMap();

        while (!number.equals("\n") && !number.equals("") && Character.isDigit(number.charAt(0))) {
            number = workflowFileReader.ReadList();
                if (!number.equals("") && Character.isDigit(number.charAt(0))) {
                    str = workflowMap.get(number);
                    substr = str.split("\\s");
                    block = blockFactory.CreateBlock(substr[0]);
                    text = block.run(substr, text);
            }
        }
    }
}
