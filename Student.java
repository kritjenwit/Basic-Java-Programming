// 09/08/2017
	Write a program to implement constructor overloading 
	by passing different number of parameter of different type


class StdInfo {
    int regno;
    String name;
    String course;
    
    StdInfo(int reg,String nm){
        regno = reg;
        name = nm;
        course = "BCA";
	System.out.println("Using 2 parameter constructor");
    }
    
    StdInfo(int reg,String nm,String c){
        regno = reg;
        name = nm;
        course = c;
	System.out.println("Using 3 parameter constructor");
    }
    
    void info(){
       
        System.out.println("Register number : " +regno);
        System.out.println("Name : " +name);
        System.out.println("Course : " +course);
    }
}


class Student{
    public static void main(String[] args){
	
	StdInfo s1 = new StdInfo(201701,"Krit");
	StdInfo s2 = new StdInfo(201702,"Jeong","MCA");

	System.out.println("---Student Information---");
	System.out.println("-------------------------");
	s1.info();
	System.out.println("-------------------------");
	s2.info();
	System.out.println("-------------------------");
    }
}