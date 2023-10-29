import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else if (left[i] > right[j]) {
                result[k++] = right[j++];
            } else {
                // Skip duplicates
                i++;
                j++;
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return Arrays.copyOf(result, k);
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        left = removeDuplicates(left);
        right = removeDuplicates(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 4, 3, 5};
        int[] result = removeDuplicates(arr);

        System.out.println("Array with duplicates: " + Arrays.toString(arr));
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
}
