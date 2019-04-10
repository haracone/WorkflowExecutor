package Blocks;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockGrep implements Blockable {
    private static final Logger logger = Logger.getLogger(BlockGrep.class.getName());

    public String run(String[] args, String text) {
        try {
            if (text == null)
                throw new Exception("Missing text");


            StringBuilder stringBuilder = new StringBuilder();
            String[] splittedText = text.split("\n");

            for (String str : splittedText) {
                if (str.contains(args[0]))
                    stringBuilder.append(str).append("\n");
            }

            if (stringBuilder.length() > 1)
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            return stringBuilder.toString();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }

        return null;
    }
}