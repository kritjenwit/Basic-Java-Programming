import java.util.Scanner;

class Prg5_Area{
	public static double circleArea(double r){
		return Math.PI * r * r;
	}
	public static double squareArea(double side){
		return side * side;
	}
	public static double rectArea(double width, double height){
		return width * height;
	}
	public static double triArea(double base, double height1){
		return 0.5 * base * height1;
	}
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------");

		System.out.print("Enter the Radius : ");
		double radius = scan.nextDouble();
		System.out.println("Area of Circle : " +circleArea(radius));
		
		System.out.println("--------------------------------------");
		
		System.out.print("Enter the Side : ");
		double side = scan.nextDouble();
		System.out.println("Area of Square : " +squareArea(side));

		System.out.println("--------------------------------------");
		
		System.out.print("Enter the Width : ");
		double width = scan.nextDouble();
		System.out.print("Enter the Height : ");
		double height = scan.nextDouble();
		System.out.println("Area of Rectagle : " +rectArea(width,height));

		System.out.println("--------------------------------------");
		
		System.out.print("Enter the Base : ");
		double base = scan.nextDouble();
		System.out.print("Enter the Height : ");
		double height1 = scan.nextDouble();
		System.out.println("Area of Triangle : " +triArea(base,height1));
		
		System.out.println("--------------------------------------");
	}
}