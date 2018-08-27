class base
{
	public void print()
	{
		System.out.print("base class");
	}
}
final class derived extends base
{
	public void print()
	{
		super.print();
		System.out.print("\nfinal derived class");
	}
}
class finalclass
{
	public static void main(String srgs[])
	{
		derived d=new derived();
		d.print();
	}
}