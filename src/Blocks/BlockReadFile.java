package Blocks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockReadFile implements Blockable {
    private static final Logger logger = Logger.getLogger(BlockReadFile.class.getName());

    public String run(String[] args, String text) throws IOException {
        try {
            if (args.length != 2)
                throw new Exception("Wrong number of input file");

            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[1]));
            StringBuilder stringBuilder = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null)
                stringBuilder.append(line).append('\n');

            if (stringBuilder.length() > 1)
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            return stringBuilder.toString();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }

        return null;
    }
}