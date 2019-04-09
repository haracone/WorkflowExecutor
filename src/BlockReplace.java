import java.io.IOException;

public class BlockReplace implements Blockable {
    public String run(String[] args, String text) throws IOException {
        return text.replaceAll(args[0], args[1]);
    }
}
