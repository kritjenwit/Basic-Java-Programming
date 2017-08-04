import java.util.Scanner;

class Factorial{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int num,fact;
        fact = 1;

        System.out.print("Enter a number to find its factorial : ");
        num = scan.nextInt();

        for (int i=1;i<=num;i++){
            fact = fact * i ;
        }
        System.out.println("Factorial of : " +num + " is : " +fact);
    }
}