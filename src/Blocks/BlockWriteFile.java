package Blocks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockWriteFile implements Blockable {
    private static final Logger logger = Logger.getLogger(BlockWriteFile.class.getName());

    public String run(String[] args, String text) throws IOException {
        try {
            if (text == null)
                throw new Exception("Missing text");

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }

        return null;
    }
}