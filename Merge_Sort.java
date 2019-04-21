import java.util.Arrays;
import java.util.Scanner;

//Created by Baha2r

public class Merge_Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(MergeSort(arr, 0, arr.length - 1)));
    }

    private static void Merge(int[] a, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(a, l, left, 0, n1);
        for (int j = 0; j < n2; j++) {
            right[j] = a[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    private static int[] MergeSort(int[] a, int l, int h) {
        int m;
        if (l < h) {
            m = (l + h) / 2;
            MergeSort(a, l, m);
            MergeSort(a, m + 1, h);
            Merge(a, l, m, h);
        }
        return a;
    }
}
