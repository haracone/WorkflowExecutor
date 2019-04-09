package Blocks;

import Blocks.Blockable;

import java.io.IOException;

public class BlockReplace implements Blockable {
    public String run(String[] args, String text) throws IOException {
        return text.replaceAll(args[1], args[2]);
    }
}
