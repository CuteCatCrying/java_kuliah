package Interface;

public class SquareAreaExample {
    public static void main(String[] args) {
        Relation r = new CompareSquareArea();
        Square squareA = new Square(10);
        Square squareB = new Square(8);
        
        
        System.out.println(r.isGreater(squareA, squareB));
    }
}
