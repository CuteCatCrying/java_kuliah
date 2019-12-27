package September_16_19V2;
public class Person {
    protected String name;
    protected String address;
    
    public Person(){
        name = "";
        address = "";
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        System.out.println("Person Name : "+name);
        return name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
}
