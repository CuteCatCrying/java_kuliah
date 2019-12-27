package Student;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord anna = new StudentRecord();
        StudentRecord ali = new StudentRecord("Ali");
        
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(20);
        anna.setMathGrade(70);
        anna.setEnglishGrade(80);
        anna.setScienceGrade(60);
        
        System.out.println("Nama\t\t: "+anna.getName());
        System.out.println("Alamat\t\t: "+anna.getAddress());
        System.out.println("Umur\t\t: "+anna.getAge());
        System.out.println("Rata-rata\t: "+anna.getAverage());
        System.out.println();
        
        System.out.println("Nama\t\t: "+ali.getName());
        System.out.println("Alamat\t\t: "+ali.getAddress());
        System.out.println("Umur\t\t: "+ali.getAge());
        System.out.println("Rata-rata\t: "+ali.getAverage());
        System.out.println();
        
        System.out.println("Jumlah\t: "+StudentRecord.getStudentCount());
    }
}
