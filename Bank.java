import java.util.Scanner;

class Bank{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
	double balance,bonus;
        String sex;
	//bonus = 0.0;

	do {

		System.out.print("Please Enter your gender (M/F) : ");
		sex = scan.nextLine();
		
	}while ( !(sex.equalsIgnoreCase("M")) && !(sex.equalsIgnoreCase("F")));

	if (sex.equalsIgnoreCase("M")) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("You are Male");
		System.out.println("For male Bonus will increase 2% \n");
	}else{
		System.out.println("----------------------------------------------------------------");
		System.out.println("You are Female");
		System.out.println("Female will increase 5% in case of current balance has more 5000");
		System.out.println("Otherwise bounus will increase 2%");

	}
	System.out.println("----------------------------------------------------------------");

	System.out.println("\nEnter a balance");
	balance = scan.nextDouble();	

	/*if (sex.equalsIgnoreCase("F")){
		if (balance > 5000){
			bonus = balance * (5.0/100.0);
		}else{	
			bonus = balance * (2.0/100.0);
		}
	}else{
		bonus = balance * (2.0/100.0);
	} */
	
	if (sex.equalsIgnoreCase("M") && (balance > 5000.0)) {
		bonus = balance * (5.0 / 100.0);
	}else{
		bonus = balance * (2.0 / 100.0);
	}
	
	balance = balance + bonus;
        System.out.println("Bonus is : " +bonus);
	System.out.println("The balance is : " +balance + "\n");
	System.out.println("----------------------------------------------------------------");
    }
}