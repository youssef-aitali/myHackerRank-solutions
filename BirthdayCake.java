import java.lang.*;
import java.util.*;

public class BirthdayCake{

    public static void main(String[] args){
        
        Scanner sc_n = new Scanner(System.in);
        System.out.println("How much years old ?");
        int age = sc_n.nextInt();                            
        int table_height[] = new int[age];

        System.out.println("Enter the height of each candle :");
        Scanner sc_h = new Scanner(System.in);
        int max = 0;

        for(int i=1;i<=age;i++){
            
            System.out.println("Height "+ i + ": ");
            
            table_height[i-1] = sc_h.nextInt();
            if(i==1){
                max = table_height[i-1];
            }else{
                max = max > table_height[i-1] ? max : table_height[i-1]; 
            }
        }

        System.out.println("=====================================================");
        
        int n_blown = 0;

        for(int i=0;i<age;i++){
            
            if(table_height[i] == max){
                n_blown = n_blown + 1;
            }

            System.out.print(table_height[i] + " ");
            
        }

        System.out.println("\n====================================================");

        System.out.println("The number of the candles Colleen blows out : " + n_blown);

    }

}