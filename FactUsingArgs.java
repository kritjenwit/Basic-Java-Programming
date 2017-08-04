//import java.util.*;
//import java.lang.*;
//import java.io.*;

class FactUsingArgs {
    public static void main(String args[]){
        int num,fact=1,len;
        
        num = Integer.parseInt(args[0]);
        
        len = args.length;
        if (len == 0){
            System.out.println("Please enter new value!");
            return;
        }else{ // end if and start else
            System.out.println("The given number is : " +num);
            for (int i = 1; i<=num ;i++){
                fact = fact * i;
            } //end for loop
        }//end else
        System.out.println("Factorial of " +num + " is : " +fact);
        System.out.printf("Test %d",fact);
    }
}