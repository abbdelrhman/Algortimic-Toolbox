import java.util.*;

public class LCS3 {

    private static int lcs3(int[] a, int[] b, int[] c) {
        //Write your code here
        int n = a.length+1;
        int m= b.length+1;
        int l = c.length+1;
        int ans[][][] = new int[n+1][m+1][l+1];
        for (int i=0 ; i<n ; i++){
            ans[i][0][0] = 0 ;
        }
        for (int i=0 ; i<m ; i++){
            ans[0][i][0] = 0 ;
        }
        for (int i=0 ; i<l ; i++){
            ans[0][0][l] = 0 ;
        }
        for (int i=1 ; i<n ; i++){
            for (int j= 1 ; j<m ; j++){
                for (int k =1 ; k<l ; k++){
                    if (a[i-1]==b[j-1] && a[i-1] == c[k-1] && b[j-1] == c[k-1]){
                        ans[i][j][k] = 1+ans[i-1][j-1][k-1];
                    }else{
                        int max1 = Math.max(Math.max(ans[i-1][j-1][k-1],ans[i-1][j][k]),ans[i][j-1][k]);
                        int max2 = Math.max(Math.max(ans[i][j][k-1],ans[i-1][j-1][k]),ans[i-1][j][k-1]);
                        ans[i][j][k]=Math.max(Math.max(max1,max2),ans[i][j-1][k-1]);

                    }
                }
            }
        }
        return ans[n-1][m-1][l-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int[] a = new int[an];
        for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();
        int[] b = new int[bn];
        for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }
        int cn = scanner.nextInt();
        int[] c = new int[cn];
        for (int i = 0; i < cn; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(lcs3(a, b, c));
    }
}

