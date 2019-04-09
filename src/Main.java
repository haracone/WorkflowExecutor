import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        BlockFactory blockFactory = new BlockFactory();
//        String str = "BlockWriteFile";
//        Blockable a;
//        if (blockFactory.CreateBlock(str) != null) {
//            System.out.println(blockFactory.CreateBlock(str));
//            a = blockFactory.CreateBlock(str);
//            a.run(args, "4");
//        }
//        WorkflowFileReader workflowFileReader = new WorkflowFileReader(new File(args[2]));
//        workflowFileReader.FindDesc();
//        System.out.println(workflowFileReader.ReadBlockId());
//        System.out.println(workflowFileReader.ReadBlock());
        WorkflowExecutor workflowExecutor = new WorkflowExecutor(new File(args[2]));
        workflowExecutor.FillingMap();
    }
}
