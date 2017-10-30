import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            n[a0] = in.nextInt();
        }

        int m = 0;
        int count = 0;

        for(int i = 0; i < t; i++){  

            m = n[i];
            count = 0;
            while(m > 0)
                {
                    if((m%10)!=0 && (n[i] % (m%10))==0) count++;
                    m = m / 10;
                }

            System.out.println(count);
        }
        


    }
}