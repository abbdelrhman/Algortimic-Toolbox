import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int indexOfMax = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        arr[indexOfMax] = Integer.MIN_VALUE;
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        //System.out.println(max);
        //System.out.println(max2);
        long ans = (long) max * (long) max2;
        //Arrays.sort(arr);
        //  System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }


}
