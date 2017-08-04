//import java.io.DataInputStream;
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        int number;
       // DataInputStream obj = new DataInputStream(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any int value");
       // number = obj.readInt();
        number = scan.nextInt();
        System.out.println("The number is : " +number);
    }
}