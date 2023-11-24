public class Second {
    static void myMethod(){
        System.out.println("Hello Static method!");
    }

    public static void main(String[] args) throws Exception {
        // Call the static method
        myMethod();

        // Access the attribute
        Person Object1 = new Person();

        // Call the public method
        Object1.myPublicMethod();

        // Display the Attributes
        System.out.println("Name: " + Object1.first_name + " " + Object1.last_name);
        System.out.println("Age: " + Object1.age);
    }
}
