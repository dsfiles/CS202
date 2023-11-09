import java.util.*;

public class Sort {
    static final int MAX = 8000; // Change MAX to test different input size
    public static void main(String args[]) {
        long start, end;
        int[] arr0 = new int[MAX];
        int[] arr1 = new int[MAX];
        int[] arr2 = new int[MAX];
        int[] arr3 = new int[MAX];
        int[] arr4 = new int[MAX];

        // Create five sets of arrays that have the same random numbers
        Random r = new Random();
        for (int i=0;i<MAX;i++)
        {
            arr0[i]=arr1[i]=arr2[i]=arr3[i]=arr4[i]=r.nextInt(MAX);
        }
        //System.out.println("Orginal array: " + Arrays.toString(arr0));

        System.out.printf("Sort arrays of %d random integers (0 - %d):\n", MAX, MAX-1);
        start = System.currentTimeMillis();
        selectionSort(arr0);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (selectionSort): " + (end - start));

        start = System.currentTimeMillis();
        mergeSort(arr1);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (mergeSort): " + (end - start));

        /*
        start = System.currentTimeMillis();
        bubbleSort(arr2);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (bubbleSort): " + (end - start));

        start = System.currentTimeMillis();
        insertionSort(arr3);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (insertionSort): " + (end - start));

        start = System.currentTimeMillis();
        quickSort(arr4);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (quickSort): " + (end - start));
        */

        System.out.println("\nSort the sorted arrays again:");

        start = System.currentTimeMillis();
        selectionSort(arr0);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (selectionSort): " + (end - start));

        start = System.currentTimeMillis();
        mergeSort(arr1);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (mergeSort): " + (end - start));

        /*
        start = System.currentTimeMillis();
        bubbleSort(arr2);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (bubbleSort): " + (end - start));

        start = System.currentTimeMillis();
        insertionSort(arr3);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (insertionSort): " + (end - start));

        start = System.currentTimeMillis();
        quickSort(arr4);
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds (quickSort): " + (end - start));
        */

        //System.out.println("Sorted array: " + Arrays.toString(arr0));
    }


    ///////////////////// start of selection sort /////////////////////
    // places the elements of the given array into sorted order
    // using the selection sort algorithm
    // post: array is in sorted (nondecreasing) order
    // textbook page 872
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            swap(a, i, smallest); // swap smallest to front
        }
    }

    // textbook page 871
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    ///////////////////// end of selection sort /////////////////////


    ///////////////////// start of merge sort /////////////////////
    // Places the elements of the given array into sorted order
    // using the merge sort algorithm.
    // post: array is in sorted (nondecreasing) order
    // textbook page 879
    public static void mergeSort(int[] a) {
        if (a.length > 1) {
            // split array into two halves
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2,
                    a.length);
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            // merge the sorted halves into a sorted whole
            merge(a, left, right);
        }
    }

    // Merges the given left and right arrays into the given
    // result array.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
    // textbook page 880
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1]; // take from left
                i1++;
            } else {
                result[i] = right[i2]; // take from right
                i2++;
            }
        }
    }
    ///////////////////// end of merge sort /////////////////////


    ///////////////////// start of bubble sort /////////////////////
    public static void bubbleSort(int[] a) {
       // your code here
    }
    ///////////////////// end of bubble sort /////////////////////


    ///////////////////// start of insertion sort /////////////////////
    public static void insertionSort(int[] array) {
       // your code here
    }
    ///////////////////// end of insertion sort /////////////////////


    ///////////////////// start of quick sort /////////////////////
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1 );
    }
    public static void quickSortHelper(int[] array, int begin, int end) {
        // your recursive function here
    }
    /*
    static int partition(int[] array, int begin, int end) {
        // your code here
    }
     */
    ///////////////////// end of quick sort /////////////////////
}
