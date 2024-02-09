package uvg.edu.gt;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import uvg.MergeSort;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] array = { 4, 3, 2, 1 };
        MergeSort.mergeSort(array);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, array);
    }
}
