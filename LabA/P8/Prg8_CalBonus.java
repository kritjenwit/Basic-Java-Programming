abstract class Department {
    double salary, bonus,totalsalary;
    public abstract void calBonus(double salary);
    public void displaytotalsalary(String dept){
        System.out.println(dept +"\t\t"+ salary + "\t\t" + bonus + "\t" + totalsalary);
    }
}

class Account extends Department{
    public void calBonus(double sal){
        salary = sal;
        bonus = sal * 0.2;
        totalsalary = salary + bonus;
    }
}

class Sales extends Department{
    public void calBonus(double sal){
        salary = sal;
        bonus = sal * 0.3;
        totalsalary = salary + bonus;
    }
}

public class Prg8_CalBonus{
    public static void main(String[] args) {
        Department acc = new Account();
        Department sales = new Sales();

        acc.calBonus(10000);
        sales.calBonus(20000);

        System.out.println("Department\tBasicSalary\tBonnus\tTotalSalary");
        System.out.println("--------------------------------------------------------------------");
        acc.displaytotalsalary("Account");
        sales.displaytotalsalary("Sales");
        System.out.println("--------------------------------------------------------------------");        
    }
}