/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September_16_19V2;

/**
 *
 * @author LABSIKOMP02
 */
public class PolimorfisExample {
    public static void printInformation(Person person){
        if(person instanceof Student){
            System.out.println("Nama\t: "+person.getName());
            System.out.println("Alamat\t: "+person.getAddress());
            System.out.println("No Bp\t: "+((Student)person).getNoBp()); //person harus diacu kestudent agar bisa mengakses method getNobp
        }else if(person instanceof Employee){
            System.out.println("Nama\t: "+person.getName());
            System.out.println("Alamat\t: "+person.getAddress());
        }
        
    }
    
    public static void main(String[] args) {
        Person ref;
        
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        ref = studentObject; // Person menunjuk kepada object student
        String temp = ref.getName(); //getName dati student class dipanggil
        System.out.println(temp);
        
        ref = employeeObject; // Person menunjuk kepada object enployee
        temp = ref.getName(); //getName dati employee class dipanggil
        System.out.println(temp);
        
        System.out.println();
        studentObject.setName("Ali");
        studentObject.setAddress("Padang");
        studentObject.setNoBp("1811081030");
        printInformation(studentObject);
        
        System.out.println();
        employeeObject.setName("Ahmed");
        employeeObject.setAddress("Riau");
        printInformation(employeeObject);
    }
}
