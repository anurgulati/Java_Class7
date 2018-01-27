
class animal
    {
		String breed, color;
		void speak()
		{
			System.out.println("grawl");
		}
	}
	class Dog extends animal
	{
		void speak() 
		{
			System.out.println("Bark");
		}
	}
	class Cat extends animal
	{
		void speak()
		{
		System.out.println("Meoowwwwww");	
		}
	}

	public class Class5_Animal_Inheritance {

	
	public static void main(String args[]) {
		animal a1=new animal();
		Dog d1=new Dog();
		Cat c1=new Cat();
		a1.speak();
		d1.speak();
		c1.speak();
		
		
	}

}
