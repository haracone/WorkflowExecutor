package Blocks;

import Blocks.Blockable;

import java.io.IOException;

public class BlockGrep implements Blockable {
    public String run(String[] args, String text) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String [] splitedText = text.split("\n");

        for (String str: splitedText)
            if (str.contains(args[0]))
                stringBuilder.append(str).append("\n");

        return stringBuilder.toString();
    }
}