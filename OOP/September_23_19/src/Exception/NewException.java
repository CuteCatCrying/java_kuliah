package Exception;

public class NewException {
    public static void main(String[] args) throws Exception{
        int nilai1 = 101;
        
        if(nilai1 > 100){
            throw new Exception("Nilai Besar dari 100"); // membuat exception baru sesuai kondisi
        }
        System.out.println(nilai1);
    }
}
