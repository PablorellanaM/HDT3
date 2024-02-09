package uvg.edu.gt;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] array = { 64, 25, 12, 22, 11 };
        int[] sortedArray = { 11, 12, 22, 25, 64 };
        SelectionSort.selectionSort(array);
        assertArrayEquals("El array no se ordenó correctamente por SelectionSort", sortedArray, array);
    }
}
