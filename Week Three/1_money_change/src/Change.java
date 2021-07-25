import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
        int a = m/10 ;
        m= m %10 ;
        int b= m/5 ;
        m = m%5;
        int c = m;


        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

