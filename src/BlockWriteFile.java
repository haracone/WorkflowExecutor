import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BlockWriteFile implements Blockable {
    public String run(String[] args, String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        bufferedWriter.write(text);
        bufferedWriter.close();

        return null;
    }
}