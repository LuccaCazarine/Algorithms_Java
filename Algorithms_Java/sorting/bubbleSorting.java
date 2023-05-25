class bubbleSorting {
    static void bubbleSorting(int arr[], int size) {
        int i, j;

        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] { 50, 25, 5, 20, 10 };

        System.out.println("Array in sorted order : ");
        bubbleSorting(arr, n);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
