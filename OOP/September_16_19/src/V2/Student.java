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
public class Student extends Person{
    private String noBp;
    
    public String getName(){
        System.out.println("Student Name : "+name);
        return name;
    }
    
    public void setNoBp(String noBp){
        this.noBp = noBp;
    }
    
    public String getNoBp(){
        return noBp;
    }
}
