import java.util.*;

public class FibonacciSumLastDigit {

    private static long getPisanoLength( long m) {


        long l = (int) (m*m)-1 ;
        long arr[] = new long[(int) l];
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
        return l;

    }
    private static long getFibonacciSum(long n) {
        if (n==0 || n==1){
            return n;
        }
        long previous = 0 ;
        long current =1 ;


        for (long  i=2 ; i<=n+2 ; i++){
            long tempPrevious = previous %10 ;
            previous =current%10 ;
            current = (tempPrevious%10 + current%10)%10 ;
        }
        return current % 10 - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long pisano = getPisanoLength(10 );
        long mappingIndex = n%pisano;
        int a=0 ,b=1,c=0 ;
        for (long i = 2; i< mappingIndex+3;i++ ){
            c=(a%10+b%10)%10 ;
            a=b%10;
            b=c%10;
        }
        c--;
        if(c<0){
            c= c+10 ;
        }
        System.out.println(c);
    }
}

