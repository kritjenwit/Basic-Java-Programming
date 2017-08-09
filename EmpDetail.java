/* 09/08/2017
    Employee Detail using default constructor and Parametize constructor 
*/

class Employee {
    int salary;
    int empno;
    String name;
    
    Employee(){
        empno = 123;   
        salary = 2000;
        name = "kim";
    }
    Employee(int eno,int sal,String nm){
        empno = eno;
        salary = sal;
        name = nm;
    }
    
    void display(){
        System.out.println("Employee = "+empno);
        System.out.println("Salary = "+salary);
        System.out.println("Name = "+name);
    }
}

public class EmpDetail {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(124,5000,"Jeong");
        System.out.println("-------------------------");
        emp1.display();
        System.out.println("-------------------------");
        emp2.display();
        System.out.println("-------------------------");
    }
}

