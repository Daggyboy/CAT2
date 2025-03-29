//Method Overloading
class MathOperations{
	public int multiply(int x, int y){
		return a*b;
	}
	
	public int multiply(int x, int y, int z){
		return x*y*z;
	}
}

//Method Overriding
class Animal{
	public void makeSound(){
		System.out.println("Animal sound");
	}
} 

class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Bark sound");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Meow sound");
	}
}

//Polymorphism
public class PolymorphismExample{
	public static void main(String[] args){
		Animal myDog=newDog();
		Animal myCat=newCat();
		
		myDog.makeSound();
		myCat.makeSound();
	}
}