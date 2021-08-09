import java.util.*;

public class Inversions {
    private static long merge(int a[], int left, int mid, int right) {
        long numberOfInversions = 0;

        int n1 = (mid-left) + 1;
        int n2 = right-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for (int i=0 ; i<n1 ; i++){
            arr1[i]=a[left+i];
        }
        for (int i=0 ; i<n2 ; i++){
            arr2[i]=a[mid+1+i];
        }
        int i = 0, j = 0, k = left;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
               a[k] = arr1[i];
                k++;
                i++;
            } else {

                a[k] = arr2[j];
                k++;
                j++;
                numberOfInversions += (mid + 1) - (left + i);
            }
        }


        while (i < arr1.length) {
            a[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            a[k] = arr2[j];
            k++;
            j++;
        }
        return numberOfInversions;


    }

    private static long getNumberOfInversions(int[] a,  int left, int right) {
        long numberOfInversions = 0;
        if (left < right) {
            int ave = (left + right) / 2;
            numberOfInversions += getNumberOfInversions(a, left, ave);
            numberOfInversions += getNumberOfInversions(a, ave + 1, right);
            numberOfInversions += merge(a, left, ave, right);
        }
        //write your code here
        return numberOfInversions;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(getNumberOfInversions(a,  0, a.length - 1));

    }
}

