package Blocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlockGrepTest {

    @Test
    public void run() {
        BlockGrep blockGrep = new BlockGrep();
        String actual = blockGrep.run(new String[]{"a"}, "a\nb\nac\nd");
        String expected = "a\nac";
        assertEquals(actual, expected);
    }
}