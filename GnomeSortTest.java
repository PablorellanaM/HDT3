package uvg;

import uvg.edu.gt.GnomeSort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class GnomeSortTest {

    @Test
    public void testGnomeSortWithUnsortedArray() {
        int[] unsorted = { 5, 3, 2, 4, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };

        GnomeSort.gnomeSort(unsorted);

        assertArrayEquals("El arreglo no se ordenó correctamente", expected, unsorted);
    }
}
