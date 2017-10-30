import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String newtime;
        int foo = Integer.parseInt(s.substring(0,2));

         if(s.charAt(8)=='P'){
            if(foo==12){
                newtime = s.substring(0,2);
            }else{
                foo = foo+12;
                newtime = Integer.toString(foo);
            }
             return s.replace(s.substring(0,2),newtime).substring(0,8);
         }else{
             if(foo==12){
                newtime = "0" + Integer.toString(0);
                return s.replace(s.substring(0,2),newtime).substring(0,8);
             }else{
                return s.substring(0,8);
             }
             
         }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
