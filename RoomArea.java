import java.io.*;
import java.util.Scanner;

class Room{
    float length;
    float width;
    void setdata(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length");
        length = scan.nextInt();
        System.out.println("Enter Width");
        width = scan.nextInt();
    }
}

class RoomArea{
    public static void main(String args[]) {
        float area;
        Room r1 = new Room();
        r1.setdata();
        area = r1.length * r1.width;
        System.out.println("Length = " +r1.length);
        System.out.println("Width = " +r1.width);
        System.out.println("Area of room =" +area);
    }
}
