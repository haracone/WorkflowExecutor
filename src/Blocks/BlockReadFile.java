package Blocks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlockReadFile implements Blockable {

    public String run(String[] args, String text) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[1]));
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null)
            stringBuilder.append(line).append('\n');

        if (stringBuilder.length() > 1)
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}