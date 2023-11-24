public class Second {
    static void myMethod(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) throws Exception {
        // Access the attribute
        myMethod();
        Person Object1 = new Person();

        // Display the Attributes
        System.out.println("Name: " + Object1.first_name + " " + Object1.last_name);
        System.out.println("Age: " + Object1.age);
    }
}
