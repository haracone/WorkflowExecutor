import java.io.*;

public class BlockReadFile implements Blockable {

    public String run(String[] args, String text) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null)
            stringBuilder.append(line);

        return stringBuilder.toString();
    }
}