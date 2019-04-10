package Blocks;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockReplace implements Blockable {
    private static final Logger logger = Logger.getLogger(BlockReplace.class.getName());

    public String run(String[] args, String text) throws IOException {
        try {
            if (args.length != 3)
                throw new Exception("Wrong numbers of replaced words");

            return text.replaceAll(args[1], args[2]);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }

        return null;
    }
}
