package overriding;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Woof! Woof!
        myCat.makeSound(); // Outputs: Meow! Meow!
    }
}
