import java.util.*;

//Created by Baha2r

public class Binary_Search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        int key = s.nextInt();
        System.out.println(BinarySearch1(b, key));
//        System.out.println(BinarySearch2(b, key, 0, n - 1));
    }


    //dynamic algorithm
    private static int BinarySearch1(int[] a, int k) {
        int low = 0, high = a.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (k == a[mid]) {
                return mid;
            }
            if (k > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    //recursive algorithms
    private static int BinarySearch2(int[] a, int k, int low, int high) {
        if (high < low)
            return -1;
        int mid = (high + low) / 2;
        if (k == a[mid]) {
            return mid;
        }
        if (k > a[mid]) {
            return BinarySearch2(a, k, mid + 1, high);
        } else {
            return BinarySearch2(a, k, low, mid - 1);
        }
    }
}
