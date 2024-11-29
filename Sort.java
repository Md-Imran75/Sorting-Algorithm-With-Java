public class Sort {

    // merge sort funtions start
    public static void mergeSort(int[] arr, int l, int h) {

        if (l >= h)
            return;

        int mid = l + (h - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);

        merge(arr, l, h, mid);

    }

    private static void merge(int[] arr, int l, int h, int mid) {

        int merge[] = new int[h - l + 1];
        int indx1 = l;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= h) {
            if (arr[indx1] < arr[indx2]) {
                merge[x++] = arr[indx1++];
            } else {
                merge[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merge[x++] = arr[indx1++];
        }

        while (indx2 <= h) {
            merge[x++] = arr[indx2++];
        }

        int i = 0;

        for (int val : merge) {
            arr[l + i++] = val;
        }

    }
    // merge sort functions end

    // quick sort functions start
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int x = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                x++;
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }

        x++;

        int temp = arr[x];
        arr[x] = arr[high];
        arr[high] = temp;

        return x;

    }
    // quick sort fuctions end

    public static void main(String[] args) {

        int arr[] = { 2, 30, 6, 12, 1, 3 };
        int size = arr.length;

        // Applying Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // printing sorted array after implement bubble sort
        System.out.print("Bubble sort, sorted array ");

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        // Applying Selection Sort

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // printing sorted array after implement selection sort
        System.out.print("Selection sort, sorted array ");

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        // // Applying Insertion Sort
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // printing sorted array after implement insertion sort
        System.out.print("Insertion sort, sorted array ");

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        // Applying Merge Sort
        mergeSort(arr, 0, size - 1);

        // printing sorted array after implement merge sort
        System.out.print("Merge sort, sorted array ");

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        // Applying Quick Sort
        quickSort(arr, 0, size - 1);

        // printing sorted array after implement quick sort
        System.out.print("Quick sort, sorted array ");

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

}
