package Interface;

public class CompareSquareArea implements Relation {    
    @Override
    public boolean isGreater(Object a, Object b){
        Square squareA = (Square) a;
        Square squareB = (Square) b;
        return squareA.getArea() > squareB.getArea();
    }
    
    @Override
    public boolean isLess(Object a, Object b){
        Square squareA = (Square) a;
        Square squareB = (Square) b;
        return squareA.getArea() < squareB.getArea();
    }
    
    @Override
    public boolean isEqual(Object a, Object b){
        Square squareA = (Square) a;
        Square squareB = (Square) b;
        return squareA.getArea() == squareB.getArea();
    }
}
