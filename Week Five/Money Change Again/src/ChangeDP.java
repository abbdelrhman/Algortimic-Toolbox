import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m, int coins[]) {
        int minNumCoins[] = new int[m + 1];
        int numCoinsChanged = 0;
        minNumCoins[0] = 0;
        for (int money = 1; money <= m; money++) {
            minNumCoins[money] = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                if (money >= coins[i]) {
                    numCoinsChanged = minNumCoins[money - coins[i]] + 1;
                    if (numCoinsChanged<minNumCoins[money]){
                        minNumCoins[money]=numCoinsChanged;
                    }
                }
            }
        }
        return minNumCoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins[] = {1, 3, 4};
        int m = scanner.nextInt();
        System.out.println(getChange(m, coins));
    }
}

