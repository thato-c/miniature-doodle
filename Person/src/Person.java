public class Person {
    
    // Remove the ability to override the value
    final int identity_number = 56720936;
    private String gender;

    // Set attributes/fields
    String first_name;
    String last_name;
    int age;  
       
    // Create a class constructor
    public Person(String fname, String lname, int years){
        this.first_name = fname;
        this.last_name = lname;
        this.age = years;
    }

    // Create a Getter
    public String getGender(){
        return gender;
    }

    // Create a Getter
    public void setGender(String gender){
        this.gender = gender;
    }
}
