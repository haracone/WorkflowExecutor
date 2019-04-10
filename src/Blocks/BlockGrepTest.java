package Blocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlockGrepTest {

    @Test
    public void run() {
        BlockGrep blockGrep = new BlockGrep();
        String actual = blockGrep.run(new String[]{"b"}, "a\nb\nc\nd");
        String expected = "b\n";
        assertEquals(actual, expected);
    }
}