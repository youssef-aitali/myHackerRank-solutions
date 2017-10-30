import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceEquation {

    public static void main(String args[]) throws Exception {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc_n = new Scanner(System.in);
        int n = sc_n.nextInt();

        int[] numbers = new int[n];
       
        for(int i = 0; i < n; i++){
            numbers[i] = sc_n.nextInt();
        }
        
        for (int j = 0; j < n; j++) {

            for (int k = 0; k < n; k++) {

                if (numbers[k] == j+1) {

                    int l = k;

                    for (int o = 0; o < n; o++) {

                        if (numbers[o] == l+1) {

                            System.out.println(o+1);
                        }
                    }
                }

            }

        }

    }

    
}