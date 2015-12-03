import java.util.Scanner;

public class Program{
	public static class Dog{
		// field
		String name;
		
		// constructor
		public Dog(String n){
			name = n;
		}
		
		// methods
		public void bark(){
			System.out.println("BARK! My name is " + name);
		}
	}
	
	public static void main(String[] args){
		// create Scanner to get the name of the pet
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		// creates a Dog and makes it bark
		Dog dog = new Dog(name);
		dog.bark();
	}
}