package Interface;

public class Square {
    private int sisi;
    
    public Square(int sisi){
        this.sisi = sisi;
    }
    
    public int getArea(){
        return sisi*sisi;
    }
}
