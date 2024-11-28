public class Sort {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 6, 12, 1 };
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
            for (int j = i + 1; j < size - 1; j++) {
                if (arr[j - 1] > arr[j]) {
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

        // Applying Insertion Sort
        for (int i = 1; i < size - 1; i++) {
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

    }

}
