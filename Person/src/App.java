public class App {
    static void myMethod(){
        System.out.println("Hello Application Static method!");
    }

    public static void main(String[] args) throws Exception {
        // Call the static method
        myMethod();

        // Create the Object
        Person person = new Person();
        Car car = new Car();

        // Display the Attributes
        System.out.println("Name: " + person.first_name + " " + person.last_name);
        System.out.println("Age: " + person.age);

        // Call the public method
        person.myPublicMethod();
        car.fullThrottle();
        car.speed(200);
    }
}
