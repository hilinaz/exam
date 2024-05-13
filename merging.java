package question1;

public class merging {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // Base case: the array is already sorted
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Populate the left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Populate the right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the merged array

        // Compare elements from the left and right arrays and merge them in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

 

	public static void main(String[] args) {
		Search sh=new Search();
		int num[]=sh.inserted();
		mergeSort(num);

	}

}
