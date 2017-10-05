import java.util.*;

class Student
{
	int rollno;
	String name;
	public void getdata(int r,String nm)
	{
		rollno=r;
		name=nm;
	}
	void showdata()	
	{
		System.out.println("Roll Number : "+rollno);
		System.out.println("Name        : "+name);
	}
}
class Test extends Student
{
	int part1, part2;
	
		public void getmarks(int m1,int m2)
		{
			part1=m1;
			part2=m2;
		}
		 void showmarks()
		{
			System.out.println("Marks Obtained");
			System.out.println("Part 1 ="+part1);
			System.out.println("Part 2 ="+part2);
		}
}
interface Sports
{
	float sportwt=6.0F;
	 void showwt();
}
class Results extends Test implements Sports
{
	float total;
	 public void showwt()
	{
		System.out.println("Sports Wt = "+sportwt);
	}
	void display()
	{
		total=part1+part2+sportwt;
		showdata();
		showmarks();
		showwt();
		System.out.println("Total Score = "+total);
	}
}
public class Hybrid
{
	public static void main(String args[])
	{
		Results stu1;
		stu1=new Results();
		int rno;
		String name;
		int p1,p2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no. : ");
		rno=sc.nextInt();

		System.out.println("Enter name of Student : ");
		name=sc.next();
		
		System.out.println("Enter marks for part 1 :");
		p1=sc.nextInt();
		
		System.out.println("Enter marks for part 2");
		p2=sc.nextInt();
		
		stu1.getdata(rno,name);
		stu1.getmarks(p1,p2);
		stu1.display();
		
	}
}
