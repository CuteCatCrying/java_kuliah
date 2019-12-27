package Interface;

public class MyInteger implements Relation{
    @Override
    public boolean isGreater(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a > nilai_b;
    }
    
    @Override
    public boolean isLess(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a < nilai_b;
    }
    
    @Override
    public boolean isEqual(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a == nilai_b;
    }
}
