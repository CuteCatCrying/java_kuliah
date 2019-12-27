package Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println(args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught!");
        }
    }
}
