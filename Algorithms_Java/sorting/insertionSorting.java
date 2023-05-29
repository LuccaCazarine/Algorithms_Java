class insertionSorting {
    static void insertionSorting(int arr[], int size) {
        int i, value, index;

        for (i = 1; i < size; i++) {
            value = arr[i];
            index = i;

            while (index > 0 && arr[index - 1] > value) {
                arr[index] = arr[index - 1];
                index--;
            }

            arr[index] = value;
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = new int[] { 40, 10, 50, 20, 30 };

        System.out.println("Array in sorted order: ");
        insertionSorting(arr, n);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
