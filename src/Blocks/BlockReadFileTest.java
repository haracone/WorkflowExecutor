package Blocks;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BlockReadFileTest {

    @Test
    public void run() throws IOException {
        BlockReadFile blockReadFile = new BlockReadFile();
        String actual = blockReadFile.run(new String[]{"Blocks\\testForRead.txt"}, null);
        String expected = "test";
        assertEquals(actual, expected);
    }
}