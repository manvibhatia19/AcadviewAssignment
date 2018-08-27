class parent
{
	public void instant()
	{
	 	System.out.print("parent class");
	}
}
class child extends parent
{
	public void instant()
	{
		super.instant();
		System.out.print("\nchild class");
	}
}
class instant
{
	public static void main(String args[])
	{
		child ch=new child();
		ch.instant();
	}
}