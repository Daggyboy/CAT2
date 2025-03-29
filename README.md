# CAT2
# Question 1:a) Encapsulation

*Student* class has private attributes name and grade.

    public class Student {

    private String name;
    private int grade;

Public *getName()* and *setName()* methods allow controlled access to the name attribute.

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

*setGrade()* method ensures grades are in the range of 0 to 100. If the grade is invalid, it defaults to 0.

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade) {
        
        if (grade>=0 && grade<=100){
            this.grade=grade;
        }else{
            this.grade=0;
        }

    }
    }

b) Method Overloading and Overriding

The two *mulitiply()* methods are created. One multiplying two integers and another multiplying three integers.

    //Method Overloading
    class MathOperations{
    public int multiply(int x, int y){
        return x*y;
    }

    public int multiply(int x, int y, int z){
        return x*y*z;
    }
    }

The makeSound() method in Dog outputs "Bark sound," while in Cat it outputs "Meow sound."

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

A *PolymorphismExample* class demonstrates polymorphism by calling overridden methods on Animal references.

    //Polymorphism
    public class PolymorphismExample{
    public static void main(String[] args){
        Animal myDog=new Dog();
        Animal myCat=new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
    }

# Question 2
# a) Abstraction

The *Appliance* class declares an abstract method *turnOn()*.

    abstract class Appliance{
    abstract void turnOn();
    }

Subclasses *Fan* and *TV* implement the *turnOn()* method to provide specific behavior.

    class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("The fan is ON");
    }
    }

    class TV extends Appliance{
    @Override
    void turnOn(){
        System.out.println("The TV is ON");
    }
    }

The *AbstractExample* class demonstrates abstraction by creating objects of *Fan* and *TV* and calling their *turnOn()* method.

    public class AbstractExample {
    public static void main(String[]args){
        Appliance myFan=new Fan();
        Appliance myTV=new TV();

        myFan.turnOn();
        myTV.turnOn();
    }
    }

# b) Exception Handling

The program prompts the user to input two numbers and divides the first by the second.

    public class DivisionException {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator:");
            int numerator=scanner.nextInt();

            System.out.println("Enter the denominator:");
            int denominator=scanner.nextInt();

            int result = numerator/denominator;
            System.out.println("Result:"+ result);

If the second number is zero, an *ArithmeticException* is caught, and a meaningful message, "Cannot divide by zero!" is displayed.

        }catch(ArithmeticException c){
            System.out.println("Cannot divide by zero!");
        }finally{
            scanner.close();
        }
    }
    }




    
