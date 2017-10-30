import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumSubarray {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc_t = new Scanner(System.in);
        int T = sc_t.nextInt();

        Scanner sc_n = new Scanner(System.in);
        Scanner sc_i = new Scanner(System.in);
        int N = 0;
        String[] A = new String[T];

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m;
        int subsequence = 0;
        
        int[] extrValues;

        String result[] = new String[T];

        int max_here = 0;
        int max_far = 0;

        for (int i = 0; i < T; i++) {

            N = sc_n.nextInt();
            A[i] = sc_i.nextLine();
          
            extrValues = new int[N];
            int j = 0;
            
            m = p.matcher(A[i]);
            
            while (m.find() && j<N) {
                 
                extrValues[j] = Integer.parseInt(m.group());
                j++;

                if (Integer.parseInt(m.group()) > 0) {
                    subsequence = subsequence + Integer.parseInt(m.group());
                    result[i] = "" + subsequence;
                }
            }

            max_here = extrValues[0];
            max_far = extrValues[0];

            for(int k=1;k<N;k++){
                max_here = extrValues[k] > max_here + extrValues[k] ? extrValues[k] : max_here + extrValues[k];
                max_far = max_far > max_here ? max_far : max_here;
            }

            result[i] = result[i] + " " + max_far;
            subsequence = 0;
        }

        for (int i = 0; i < T; i++){
            System.out.println(result[i]);
        }
        

    }
}