interface Animal
{
	void speak(String s);
	void eat(String e);
}
class Dog implements Animal
{
	public void speak(String lang)
	{
	System.out.println("Dogs "+lang);
	}
	public void eat(String food)
	{
	System.out.println("\nDogs eat "+food);
	}
}
class Cat implements Animal
{
	public void speak(String lang)
	{
	System.out.println("\nCats do "+lang);
	}
	public void eat(String food)
	{
	System.out.println("\nCats eat "+food);
	}
}
class interfaceCall
{
	public static void main(String args[])
	{
	Dog d=new Dog();
	d.speak("bark");
	d.eat("raw bones");
	Cat c=new Cat();
	c.speak("meow");
	c.eat("raw meat");
	}
}