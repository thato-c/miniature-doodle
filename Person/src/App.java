import java.util.Scanner;

public class App {
    static void myMethod(){
        System.out.println("Hello Application Static method!");
    }

    public static void main(String[] args) throws Exception {
        // Call the static method
        myMethod();

        // Create the Object
        Person person = new Person("John", "Doe", 24);
        Car car = new Car("Mustang", 1969);
        Animal pig = new Pig();
        Animal dog = new Dog();
        Scanner scanner = new Scanner(System.in);

        // Access the components of the Person class
        System.out.println("");
        System.out.println("====Person View====");
        System.out.println("");

        System.out.println("Name: " + person.first_name + " " + person.last_name);
        System.out.println("Age: " + person.age);
        // Set the value using the setter
        person.setGender("Female");
        // Get the value using the getter
        System.out.println(person.getGender());

        // Access the components of the Car class        
        System.out.println("");
        System.out.println("====Car View====");
        System.out.println("");

        System.out.println(car.modelName + " " + car.modelYear);
        car.fullThrottle();
        car.speed(200);
        car.honk(); // Access the method from superclass

        // Access the components of the Car class        
        System.out.println("");
        System.out.println("====Animal View====");
        System.out.println("");

        pig.animalSound();
        pig.sleep();
        dog.animalSound();

        System.out.println("");
        System.out.println("====Communication View====");
        System.out.println("");
        System.out.println("Enter username");
        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("");

    }
}
