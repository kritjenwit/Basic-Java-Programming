class DemoTry{
	public static void main(String[] args){
		
		int x,a=17,b=5,c=5;
		int y;
		int number[] = new int[3];
		
		number[0] = 12;
		number[1] = 30;
		number[2] = 45;
		
		try{
			x = ( a + (b - c));
		}catch(ArithmeticException ex){
			System.out.println("Division by Zero");
		}
		
		try{
			number[5] = 20;
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("You are tryint to store the value outside the limit");
		}
	}
}