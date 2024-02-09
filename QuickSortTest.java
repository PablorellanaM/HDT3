package uvg.edu.gt;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] array = { 4, 3, 2, 1 };
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, array);
    }
}
