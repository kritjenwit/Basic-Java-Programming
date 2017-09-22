class DemoCatch{
	public static void main(String[] args){
		int number[] = {3,5,8};
		int b = 5;
		int x,y;
		
		try{
			x = number[5]/b;
		}catch(ArithmeticException ex){
			System.out.println("Division by Zero");
		}catch(NumberFormatException ex){
			System.out.println("DData type Mismatch");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array out of index");
		}
	}
}