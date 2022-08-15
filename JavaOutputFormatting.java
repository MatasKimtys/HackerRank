
/*
Author: Matas Kimtys

Sample Input
java 100
cpp 65
python 50

Sample Output
================================
java           100 
cpp            065 
python         050 
================================
*/
import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            for (int j = s1.length() - 1; j < 14; j++) {
                s1 += " ";
            }
            if (x < 100 && x > 9) {
                s1 += "0";
                s1 += String.valueOf(x);
            } else if (x < 10) {
                s1 += "00";
                s1 += String.valueOf(x);
            } else {
                s1 += String.valueOf(x);
            }
            System.out.println(s1);
        }
        System.out.println("================================");
    }
}
