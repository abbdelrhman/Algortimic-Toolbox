import java.util.*;

class EditDistance {
    public static int EditDistance(String s, String t) {
        //write your code here
        int n= s.length()+1;
        int m=t.length()+1;
        int arr[][] = new int[n][m];

        for (int i=0 ; i<n ; i++){
            arr[i][0] = i ;
        }
        for (int i=0 ; i<m ; i++){
            arr[0][i] = i ;
        }
        for (int i=1 ; i<n ; i++){
            for (int j=1 ; j<m ; j++){

                    if (s.charAt(i-1) == t.charAt(j-1)){
                        arr[i][j] = arr[i-1][j-1];
                    }else{
                        arr[i][j]=1+ Math.min(Math.min(arr[i-1][j-1],arr[i-1][j]),arr[i][j-1]);
                    }

            }
        }
        return arr[n-1][m-1];
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        System.out.println(EditDistance(s, t));
    }

}
