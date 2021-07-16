import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        int l = (int) (m*m)-1 ;
        long arr[] = new long[l];
        arr[0]=0;
        arr[1]=1;
        for (int i=2 ; i<l; i++){
            arr[i]= (arr[i-1]%m+arr[i-2]%m)%m;
        }
        ArrayList<Long> ansArr = new ArrayList<>();
        ansArr.add(0,0l);
        ansArr.add(0,1l);
        ansArr.add(0,1l);
        for (int i=3 ; i<l; i++){
        if ( i<=l-3 &&   (arr[i] ==0 && arr[i+1] == 1 && arr[i+2] == 1)){
            break;
        }
        ansArr.add(i,arr[i]);
        }
        l=ansArr.size();
        int ans = (int)(n % (long) l);
        return arr[ans];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

