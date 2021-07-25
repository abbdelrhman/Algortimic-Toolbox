import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int currentRefill = 0, numRefills = 0;
        int lastRefill = 0;

        while (currentRefill < stops.length) {
            while ((currentRefill < stops.length) && (stops[currentRefill] - lastRefill <= tank) ) {
                currentRefill++;
                if (currentRefill == stops.length){
                    if (dist - lastRefill <= tank){
                        return numRefills ;
                    }else {
                        currentRefill = stops.length-1;
                        lastRefill= stops[currentRefill];
                        numRefills++;
                        return (dist-lastRefill<= tank)? numRefills : -1 ;
                    }
                }
            }
            if (currentRefill == 0){
                return -1 ;
            }
            if ( lastRefill == stops[currentRefill-1] )   {
                return -1;
            } else if (currentRefill < stops.length) {
                numRefills++;
                currentRefill--;
                lastRefill = stops[currentRefill];
            }

        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
