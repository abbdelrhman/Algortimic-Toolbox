import java.util.*;

public class FibonacciPartialSum {

    private static long getFibonacciPartialSum(long from, long to) {
        long fromPrime = (from %60);
        long toPrime =  (to %60);
        long indexOfSumOfTo =  (toPrime+2);
        long indexOfSumOfFrom =  (fromPrime+1);
        long sumOfFrom = 0 ;
        long sumOfTo = 0 ;
        long max = Math.max(indexOfSumOfTo,indexOfSumOfFrom);
        int a=0,b=1,c=0 ;
        for (long  i =2 ; i<=max; i++){
            c=(a%10+b%10)%10;
            a=b%10;
            b=c%10;
            if(i == indexOfSumOfFrom){
               sumOfFrom = c-1 ;
               if(sumOfFrom<0){
                   sumOfFrom+=10;
               }
           //   System.out.println("sum of from " + sumOfFrom);
            }
            if(i == indexOfSumOfTo){
                sumOfTo = c-1 ;
                if(sumOfTo<0){
                    sumOfTo+=10;
                }
              //  System.out.println("sum of to " + to);
            }
        }


        long ans = sumOfTo-sumOfFrom ;
        if (ans<0){
            ans+=10 ;
        }
        return ans % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSum(from, to));
    }
}

