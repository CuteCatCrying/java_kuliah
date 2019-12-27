package Latihan2;

public class ShapeExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
                
        circle.setRadius(4);
        System.out.println("Bentuk\t= " + circle.getName());
        System.out.println("Area\t= " + circle.getArea());
        
        System.out.println("");
        
        square.setPanjang(8);
        System.out.println("Bentuk\t= " + square.getName());
        System.out.println("Area\t= " + square.getArea());
    }
}
