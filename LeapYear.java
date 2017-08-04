import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year;

        System.out.print("Enter a year : ");
        year = scan.nextInt();

        if ((year % 4) == 0){
            System.out.println(+year+" is leap year");
        }else{
            System.out.println(+year+" is not leap year");
        }

    }
}