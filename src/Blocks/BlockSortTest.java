package Blocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlockSortTest {

    @Test
    public void run() {
        BlockSort blockSort = new BlockSort();
        String actual = blockSort.run(new String[]{null}, "C\n");
        String expected = "C";
        assertEquals(expected, actual);
    }
}