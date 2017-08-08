class Bank{
    int accno;
    float balance;
    String name;
    
    void init(int acc, String nm, float bal){
        accno = acc;
        name = nm;
        balance = bal;
    }
    
    void deposite(float amt){
        balance = balance + amt;    
    }
    
    void withdraw(float amt){
        balance = balance - amt;
    }
    
    void info(){
        System.out.println("Account number is : " +accno);
       
        System.out.println("Name is : " +name);
        
        System.out.println("balance is : " +balance);
    }
}

public class BankAcc {
    public static void main(String args[]){
        Bank c1,c2;
        c1 = new Bank();
        c2 = new Bank();
        
        c1.init(1001,"Kim",5000);
        
        c2.init(1002,"Jeong",7000);
       
        
        c1.deposite(5000);
        
        c2.withdraw(2000);
        
        System.out.println("---------------------------");
        c1.info();
        System.out.println("---------------------------");
        c2.info();
        System.out.println("---------------------------");
    }
}
