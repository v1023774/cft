public class MegreSortInt {
    protected static void MergeSort(long[] arr, int n){
        if(arr.length < 2) return;

        int mid = n/2;

        long[] left = new long[mid];
        long[] right = new long[n-mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        MergeSort(left, mid);
        MergeSort(right, n - mid);

        Merge(arr, left, right, mid, n - mid);
    }
    private static void Merge(long[] src, long[] left, long[] right, long leftLength, long rightLength) {
        int k = 0, i = 0, j = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) src[k++] = left[i++];
            else src[k++] = right[j++];
        }

        while (i < leftLength) {
            src[k++] = left[i++];
        }

        while (j < rightLength) {
            src[k++] = right[j++];
        }
    }

}
