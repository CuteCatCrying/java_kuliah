package Inheritance;

public class Student extends Person{
    private String nobp;
    
    public Student(){
        System.out.println("Student Constructor");
        
    }
        
    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ali";
        student.setName("Ali");
        student.setAddress("Padang");
        student.setNobp("1811081030");
    }
}
