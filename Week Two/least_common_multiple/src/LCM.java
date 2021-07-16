import java.util.*;

public class LCM {
    private static int Euclidean_gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            int aPrime = a % b;
            a = b;
            b = aPrime;
            return Euclidean_gcd(a, b);
        }

    }

    private static long lcm(int a, int b) {

        return ((long) a * b) / Euclidean_gcd(a,b) ;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm(a, b));
    }
}
