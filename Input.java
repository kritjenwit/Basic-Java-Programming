import java.util.Scanner;

class Input{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer value : ");
		int num = scan.nextInt();
		System.out.print("Enter float value : ");
		float flotNum = scan.nextFloat();
		System.out.print("Enter double value : ");
		double doubNum = scan.nextDouble();
		System.out.print("Enter String value : ");
		String str = scan.next();
		
		System.out.println("Interger value : " +num);
		System.out.println("Float value : " +flotNum);
		System.out.println("Double value : " +doubNum);
		System.out.println("String value : " +str);	
	}
}	

