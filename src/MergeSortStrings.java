public class MergeSortStrings {


    protected static String[] MergeSort(String[] Arr, int lo, int hi)
    {
        if (lo == hi) {
            String[] A = { Arr[lo] };
            return Arr;
        }
        int mid = lo + (hi - lo) / 2;


        String[] arr1 = new String[mid];
        String[] arr2 = new String[hi-mid + 1];

        System.arraycopy(Arr, 0, arr1, 0, mid);
        System.arraycopy(Arr, mid, arr2, 0, hi+1 - mid);

        Arr = Merge(arr1, arr2);
        return Arr;
    }

    private static String[] Merge(
            String[] Arr1, String[] Arr2)
    {
        int m = Arr1.length;
        int n = Arr2.length;
        String[] Arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(
                    Arr1[i], Arr2[j])) {

                Arr3[idx] = Arr1[i];
                i++;
                idx++;
            }
            else {
                Arr3[idx] = Arr2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            Arr3[idx] = Arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            Arr3[idx] = Arr2[j];
            j++;
            idx++;
        }
        return Arr3;
    }

    // Return true if str1 appears before
    // str2 in alphabetical order
    private static boolean isAlphabeticallySmaller(
            String str1, String str2)
    {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }
}
