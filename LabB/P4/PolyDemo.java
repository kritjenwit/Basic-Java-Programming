abstract class Player
{
	private String name;
	public Player(String nm)
	{
		name=nm;
	}
	public String getName()
	{
		return(name);
	}
	public abstract void play();		//abstract method : no implementation
}
class Cricket_Player extends Player
{
	Cricket_Player(String var)
	{
		super(var);
	}
	public void play()
	{
		System.out.println(getName()+" plays Cricket ");
	}
}

class Hockey_Player extends Player
{
	Hockey_Player(String var)
	{
		super(var);
	}
	public void play()
	{
		System.out.println(getName()+"  Plays Hockey ");
	}
}class Football_Player extends Player
{
	Football_Player(String var)
	{
		super(var);
	}
	public void play()
	{
		System.out.println(getName()+"  plays Football ");
	}
}
public class PolyDemo
{
	public static void main(String args[])
	{
		Player ref;
		Cricket_Player c1=new Cricket_Player("Sachin");
		Hockey_Player h1=new Hockey_Player("Dhanaraj");
		Football_Player f1=new Football_Player("Ronaldo"); 

		ref=c1;
		ref.play();
		
		ref=h1;
		ref.play();

		ref=f1;
		ref.play();
	}
}
