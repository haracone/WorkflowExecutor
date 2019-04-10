package Blocks;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BlockReplaceTest {

    @Test
    public void run() throws IOException {
        BlockReplace blockReplace = new BlockReplace();
        String[] str = {"test1", "test2"};
        String actual = blockReplace.run(str, "test1");
        String expected = "test2";
        assertEquals(actual, expected);
    }
}