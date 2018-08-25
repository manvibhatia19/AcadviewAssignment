class Overload
{
	public void print()
	{
		System.out.print("\nzero parameters");
	}
	public void print(int n)
	{
		System.out.print("\ninteger no. is: "+n);
	}
	public void print(float f)
	{
		System.out.print("\nfloat no. is: "+f);
	}
	public static void main(String args[])
	{
		Overload obj=new Overload();
		obj.print();
		obj.print(10);
		obj.print(12.7f);
	}
}