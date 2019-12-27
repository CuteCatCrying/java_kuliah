package Exception;

public class TestException {
    public static void main(String[] args) {
        try{
            for(int i=0; true; i++){
                System.out.println("args["+i+"]= "+args[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR : ");
            System.out.println("\t"+e);
        }finally{
            System.out.println("Quiting...");
        }
        
    }
}
