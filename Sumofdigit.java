import java.util.Scanner;

class Sumofdigit{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num,sum = 0,temp,origi;
        System.out.print("Enter a number : ");
        num=scan.nextInt();
        origi = num;

        System.out.println("The given number is : " +num);
        
        while (num > 0){
            temp = num % 10; 
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println("Sum of " +origi + " is : "+sum);
    }
}