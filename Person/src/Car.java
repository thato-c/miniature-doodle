public class Car {
    String modelName;
    int modelYear;

    public Car(String name, int year){
        modelName = name;
        modelYear = year;
    }

    // Create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }
}
