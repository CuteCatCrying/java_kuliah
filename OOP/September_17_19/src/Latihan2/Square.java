package Latihan2;

public class Square extends Shape{
    private int panjang;
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    @Override
    public double getArea(){
        return panjang*panjang;
    }
    
    @Override
    public String getName(){
        return "Square";
    }
}
