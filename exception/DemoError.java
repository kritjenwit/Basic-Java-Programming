class DemoError{
	public static void main(String[] args){
		int x, a = 11 , b = 3 , c = 3;
		int y;
		try {
			x = (a/(b-c));
		}catch(ArithmeticException ex){
			System.out.println("Division by zero encounter");
		}
		
		y = (a/b+c);
		System.out.println("y = " +y);
	}
}