import java.util.Arrays;
import java.util.Scanner;

//Created by Baha2r

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(QuickSort(arr, 0, arr.length - 1)));
    }

    private static int Partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l, temp;
        for (int j = l + 1; j <= h; j++) {
            if (a[j] <= pivot) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i];
        a[i] = a[l];
        a[l] = temp;
        return i;
    }

    private static int[] QuickSort(int[] a, int l, int h) {
        int p;
        if (l < h) {
            p = Partition(a, l, h);
            QuickSort(a, l, p - 1);
            QuickSort(a, p + 1, h);
        }
        return a;
    }
}
