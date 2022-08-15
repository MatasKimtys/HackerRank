/*
Author: Matas Kimtys

Sample Input:
2
0 2 10
5 3 5

Sample Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

import java.util.*;
import java.io.*;

class JavaLoopsIIChallenge {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int calculation = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;

            for (int j = 1; j <= n; j++) {
                calculation = ((int) Math.pow(2, (j - 1))) * b;
                result += a + calculation;
                a = 0;
                System.out.print(result);
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        in.close();
    }
}
