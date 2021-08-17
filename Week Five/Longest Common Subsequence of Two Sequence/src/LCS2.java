import java.util.*;

public class LCS2 {

    private static int lcs2(int[] a, int[] b) {
        //Write your code here
        int n = a.length+1;
        int m = b.length+1;
        int ans[][] = new int [n][m];
        for (int i=0 ; i<n ; i++){
            ans[i][0] = 0 ;
        }
        for (int i=0 ; i<m ; i++){
            ans[0][i] = 0 ;
        }
        for (int i=1 ; i<n ; i++){
            for (int j=1 ; j<m ; j++){
                if (a[i-1] == b[j-1]){
                    ans[i][j] = 1 + ans[i-1][j-1];
                }else {
                    ans[i][j] = Math.max(Math.max(ans[i-1][j-1],ans[i][j-1]),ans[i-1][j]);
                }
            }
        }
        return ans[n-1][m-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}

