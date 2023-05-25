public class selectionSorting {
    void swap(int arr[], int i, int j) {
    }

    void SelectionSorting(int arr[], int size) {

        int i, j;

        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }

}
