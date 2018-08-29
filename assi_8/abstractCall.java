abstract class Animal
{
	String color;
	String breed;
	String name;
	abstract void eat(String e);
	public void speak(String s)
	{	}
}
class Dog extends Animal
{
	public void display(String color, String breed, String name)
	{
	super.color=color;
	super.breed=breed;
	super.name=name;
	System.out.println("animal: dog\ncolor: "+color+"\nbreed: "+breed+"\nname: "+name);
	}
	public void eat(String food)
	{
	System.out.println("food: "+food);
	}
	public void speak(String lang)
	{
	System.out.println("speak: "+lang);
	}
}
class abstractCall
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.display("white","labrador","cooper");
		d.speak("bark");
		Animal a=new Dog();
		a.eat("raw bones");
	}
}