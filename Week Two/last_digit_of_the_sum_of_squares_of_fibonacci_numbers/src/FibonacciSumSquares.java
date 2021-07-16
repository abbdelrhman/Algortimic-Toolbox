import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquares(long n) {
        if (n <= 1)
            return n;
        int sumLength = (int) (n%60);

        long a = 0;
        long b  = 1;
        long c = 1;


        for (int  i = 2; i <= sumLength+1; ++i) {
           c = (a%10 + b%10)%10;
           a=b%10;
           b=c%10;

        }
        long sum = (b*a)%10;
        if (sum<0){
            sum+=10;
        }

        return sum % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquares(n);
        System.out.println(s);
    }
}

