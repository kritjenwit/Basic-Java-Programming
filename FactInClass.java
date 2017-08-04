class FactInClass {
	public static void main(String args[]){
		int i,j,len,fact = 1, number;
		len = args.length;
		
		if (len == 0){
			System.out.println("Please Enter new value");
			return;
		}
		
		// To show the given number
		for (i=0;i<len;i++){
			number = Integer.parseInt(args[i]);
			System.out.println("The given number is : " +number);
		}
		System.out.println("---------------------------------------");
		
		// Start the initialize
		for (i=0;i<len;i++){
			number = Integer.parseInt(args[i]); 
			for (j=number;j>=1;j--) {
				fact = fact * j;
			}
			System.out.println("Factorial of " +number +" is : " +fact);
			fact = 1;
		} // end for loop
		System.out.println("----------------------------------------");
	} //end main
}
		
