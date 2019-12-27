package Inheritance;

public class Person {
    protected String name; // "protected" boleh digunakan sub class nya,, berarti boleh digunakan di students
    protected String address;
    
    public Person(){
        System.out.println("Person Construktor");
        name = "";
        address = "";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}
