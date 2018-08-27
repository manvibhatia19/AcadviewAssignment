class constructor
{
	public constructor()
	{
		System.out.print("deault constructor");
	}
	public constructor(String msg)
	{
		this();
		System.out.print("\nparameterized constructor with msg: "+msg);
	}
	public static void main(String args[])
	{
		constructor cons=new constructor("hello");
	}
}