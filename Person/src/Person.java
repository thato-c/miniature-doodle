public class Person {
    // Set attributes/fields
    String first_name = "John";
    String last_name = "Doe";
    int age = 24;

    // Create a class constructor
    public Person(){
        first_name = "John";
        last_name = "Doe";
        age = 24;
    }

    // Set public method
    public void myPublicMethod(){
        System.out.println("Hello Person Public method!");
    }

    // Remove the ability to override the value
    final int identity_number = 56720936;   
}
