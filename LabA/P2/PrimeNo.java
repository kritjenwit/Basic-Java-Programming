class PrimeNo{
	public static void main(String[] args) {
        int i,j,len=0,rem=0;
    	int num1=0,num2=0;
		boolean flag = false;
		
		len = args.length;

    	if (len < 2 || len > 2){
			System.out.println("Please Enter at least 2 number : Please Try again!!");
			return;
		}
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		
		if ( num1 > num2 ){
			System.out.println("Num2 > num1");
			return;
		} //
		
		System.out.println("The given number is : " +num1 +" and " +num2);		
			if (num1 == 2){
				System.out.print(num1 +",");
			}
			System.out.println("----------Prime number is : -----------");
			for (i=num1;i<=num2;i++) {
				for (j=2;j<i;j++){
					rem = i % j;
					if (rem == 0) {
						flag = false;
						break;
					}else{
						flag = true;
					}	
				} // End second for();
				if (flag == true){
					System.out.println(i +" ");
				}		
    		}//End first for();
			System.out.println("-----------------------");
	}//End main
} //End class