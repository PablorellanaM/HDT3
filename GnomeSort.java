package uvg.edu.gt;

public class GnomeSort {
    public static void gnomeSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 34, 2, 10, -9 };
        gnomeSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
