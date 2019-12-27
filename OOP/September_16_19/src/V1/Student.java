package V1;

public class Student extends Person{
    private String noBp;
    
    public Student(String name, String address, String noBp){
        // ada dua cara untuk set nama dan address pada kelas Student
        super(name,address); // 1. mengeksekusi  kunstruktor Person yang memiliki 2 parameter
        /*
            super.name = name; // 2. kata kunci super untuk memanggil attribut pada superclass
            super.address = address;
        */
        this.noBp = noBp;
    }
    
    public void setNoBp(String noBp){
        this.noBp = noBp;
    }
    
    public String getNoBp(){
        return noBp;
    }
    
    public Student(){
        System.out.println("Inside Student: Constructor");
    }
    
    public static void main(String[] args) {
        Student siswa1 = new Student();
        Person siswa2 = new Person("Udin","Mojokerto");
        Student siswa3 = new Student("Gery","Tanggerang","1811081030");
        
        System.out.println("\nObject siswa 1"); // pada object ini kosong karena mengeksekusi konstruktor Person tanpa Parameter
        System.out.println("Nama\t: " + siswa1.getName());
        System.out.println("Address\t: " + siswa1.getAddress());
        
        System.out.println("\nObject siswa 2"); // pada object ini tidak bisa set no Bp
        System.out.println("Nama\t: " + siswa2.getName());
        System.out.println("Address\t: " + siswa2.getAddress());
        
        System.out.println("\nObject siswa 3"); // pada object ini bisa set no Bp
        System.out.println("Nama\t: " + siswa3.getName());
        System.out.println("Address\t: " + siswa3.getAddress());
        System.out.println("No Bp\t: " + siswa3.getNoBp());
    }
}
