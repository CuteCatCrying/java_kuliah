package Latihan2;

public class Circle extends Shape{
    private double radius;
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return (3.14*radius*radius);
    }
    
    @Override
    public String getName(){
        return "Circle";
    }
}
