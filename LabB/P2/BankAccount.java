class Bank
{
	int accno;
	String name;
	double balance;
	Bank(int ac,String nm,double bal)
	{
		accno=ac;
		name=nm;
		balance=bal;
	}
	void deposit(double bal)
	{
		balance=balance+bal;
	}
	void withdraw(double bal)
	{
		if ((balance - bal )<1000)
			System.out.println("INSUFFICIENT AMOUNT");
		else
			balance=balance-bal;
	}
	void info()
	{
		System.out.println("Name - "+name);
		System.out.println("Balance - "+balance);
	}
}
class BankAccount
{
	public static void main(String args[])
	{
		Bank cust1,cust2;
		cust1=new Bank(101,"Rohit",12000);
		cust2=new Bank(102,"Anamika",20000);
		System.out.println("First Customer");
		System.out.println("****************");
		cust1.info();
		System.out.println("After depositing 5000 Rs.");
		cust1.deposit(5000);
		cust1.info();
		System.out.println("\nSecond Customer");
		System.out.println("********************");
		cust2.info();
		System.out.println("After 10000 Rs. is withdrawn ");
		

		cust2.withdraw(10000);
		cust2.info();
		System.out.println("Again 10000 Rs. is withdrawn");
		cust2.withdraw(10000);
		
		
	}
}
