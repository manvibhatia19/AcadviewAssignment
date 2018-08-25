abstract class Vehicle
{
	abstract void start();
	public void stop()
	{
		System.out.print("\nstop detail of vehicle: ");
	}
	public static void main(String args[])
	{
		Vehicle two=new Twowheeler();
		Vehicle four=new Fourwheeler();
		two.start();
		four.start();
		two.stop();
		four.stop();
	}
}
class Twowheeler extends Vehicle
{
	public void start()
	{

		System.out.print("\ntwowheeler start at: 10:00am");
	}
	public void stop()
	{
		System.out.print("\ntwowheeler stop at: 07:00pm");
	}
}
class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.print("\nfourwheeler start at: 12:00pm");
	}
	public void stop()
	{
		System.out.print("\nfourwheeler stop at: 10:00pm");
	}
}