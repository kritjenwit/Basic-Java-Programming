class Student
{
	String name;
	String address;
	int age;
	Student(String nm,String add,int a)
	{
		name=nm;
		address=add;
		age=a;
	}
	void display()
	{
		System.out.println("***Student Information***");
		System.out.println("Name : "+name+"\n"+"Address  :"+address+"\n"+"Age  :"+age);
	}
}
class PGStudent extends Student
{
 	int age;
	int percentage;
	String course;
	PGStudent(String nm,String add,int a,String c,int p)
	{
		super(nm,add,a);
		course=c;
		percentage=p;
		age=super.age;
	}
	void display()
	{
		super.display();
		System.out.println("Course   : "+course);
	}
}
class TestStudent
{
	public static void main(String args[])
	{
		Student stu1=new Student("Amit Kumar","A-12 Saket",23);
		PGStudent stu2=new PGStudent("Shaily Garg","B-23 Civil Lines",24,"MCA",80);
		
		stu1.display();
		stu2.display();
	}
}
