class Animal
{
	String breed;
	String color;
	public void speak()
	{
		System.out.print("enter the animal: ");
	}
	public static void main(String args[])
	{
		Animal anim=new Animal();
		Animal dog=new Dog();
		Animal cat=new Cat();
		anim.speak();
		dog.speak();
		cat.speak();
	}
}
class Dog extends Animal
{
	public void speak()
	{
		breed="bulldog";
		color="white";
		System.out.print("\nbreed of dog: "+breed+"\ncolor: "+color);
	}
}
class Cat extends Animal
{
	public void speak()
	{
		breed="ragdoll";
		color="white";
		System.out.print("\nbreed of cat: "+breed+"\ncolor: "+color);
	}
}