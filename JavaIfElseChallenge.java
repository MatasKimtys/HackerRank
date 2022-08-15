/*
Author: Matas Kimtys

Sample Input 
3

Sample Output
Weird
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElseChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 == 1) {
            System.out.println("Weird\n");
        } else if (N % 2 == 0 && N > 1 && N < 6) {
            System.out.println("Not Weird\n");
        } else if (N % 2 == 0 && N > 5 && N < 21) {
            System.out.println("Weird\n");
        } else {
            System.out.println("Not Weird\n");
        }
    }
}
