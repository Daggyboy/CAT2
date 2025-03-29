# CAT2
# Question 1:
a) Encapsulation
Student class has private attributes name and grade.

    public class Student {

    private String name;
    private int grade;

Public getName() and setName() methods allow controlled access to the name attribute.

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

setGrade() method ensures grades are in the range of 0 to 100. If the grade is invalid, it defaults to 0.

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

    //Method Overloading
    class MathOperations{
    public int multiply(int x, int y){
        return x*y;
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
        Animal myDog=new Dog();
        Animal myCat=new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
    }


    
