public class Second {
    public static void main(String[] args) throws Exception {
        // Access the attribute
        App Object1 = new App();
        App Object2 = new App();

        // Modify/Override the Attribute
        Object2.x = 70;

        System.out.println(Object1.x);       
        System.out.println(Object2.x);

    }
}
