public class Person {
    // Set attributes/fields
    String first_name = "John";
    String last_name = "Doe";
    int age = 24;

    // Set public method
    public void myPublicMethod(){
        System.out.println("Hello Public method!");
    }

    // Remove the ability to override the value
    final int identity_number = 56720936;   
}
