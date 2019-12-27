public class Aritmatika {
    private int angka1;
    private int angka2;
    
    public void setAngka(int angka1, int angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    public int getTambah(){
        return (angka1+angka2);
    }
    
    public int getKurang(){
        return (angka1-angka2);
    }
    
    public int getKali(){
        return (angka1*angka2);
    }
    
    public double getBagi(){
        return ((double)angka1/angka2);
    }
    
    public boolean isGanjil(int bilangan){
          return bilangan % 2 != 0;
    }
    
    public boolean isGenap(int bilangan){
          return bilangan % 2 == 0;
    }
    
    public void getGanjilFromArray(int[] a){
        for(int i=0; i<a.length; i++){
            if(isGanjil(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }

    public void getGenapFromArray(int[] a){
        for(int i=0; i<a.length; i++){
            if(isGenap(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Aritmatika A = new Aritmatika();
        
        A.angka1 = 9;
        A.angka2 = 5;
        System.out.println(A.getTambah());
        System.out.println(A.getKurang());
        System.out.println(A.getKali());
        System.out.println(A.getBagi());
        
        System.out.println();
        System.out.println(A.isGanjil(5));
        System.out.println(A.isGenap(4));
        
        System.out.println();
        int[] angka = {1,2,5,7,10,12};
        System.out.println("Ganjil");
        A.getGanjilFromArray(angka);

        System.out.println("\nGenap");
        A.getGenapFromArray(angka);
    }
}
