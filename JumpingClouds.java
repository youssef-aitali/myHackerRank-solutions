import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int i = k ;
        int E = 100;

        while(i%n !=0){
            E = (c[i] == 0) ? E-1:E-3;
            i = i + k;
        }

        E = (c[i%n] == 0) ? E-1:E-3;

        System.out.println(E);
    }
}
