import java.util.Scanner;

public class VCDExample extends VCD {
    private final VCD[] vcd = new VCD[10];
    
    public void entriData(int i, VCD vcd){
        this.vcd[i] = vcd;
    }
    
    public void print(){
        int i = 0;
        while(vcd[i] != null){
            System.out.println("Data ke-"+(i+1));
            System.out.println("===================================");
            System.out.println("||Judul\t\t: " + vcd[i].judul + "\t\t||");
            System.out.println("||Aktor\t\t: " + vcd[i].aktor + "\t\t||");
            System.out.println("||Sutradara\t: " + vcd[i].sutradara + "\t\t||");
            System.out.println("||Publisher\t: " + vcd[i].publisher + "\t\t||");
            System.out.println("||Kategori\t: " + vcd[i].kategori + "\t\t||");
            System.out.println("||Stok\t\t: " + vcd[i].stok + "\t\t||");
            System.out.println("===================================");
            System.out.println();
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VCDExample vcdE = new VCDExample();
        String pilih;
        int i = 0;
        boolean ulang = true;
        
        
        while(ulang){
            System.out.println("==========================");
            System.out.println("||\tRental VCD\t||");
            System.out.println("||1. Entri Data\t\t||");
            System.out.println("||2. Check Data\t\t||");
            System.out.println("||3. Keluar\t\t||");
            System.out.println("==========================");
            System.out.print("Pilih ? ");
                pilih = in.nextLine();

            switch(pilih){
                case "1" : {
                    System.out.println("\tEntri Data");
                    System.out.println("\t==========");
                    System.out.println("Banyak Data Max 10");
                    
                    VCD vcd = new VCD();
                    System.out.println("Data ke-"+(i+1));
                    System.out.print("Judul\t\t: ");
                        vcd.judul = in.nextLine();
                    System.out.print("Aktor\t\t: ");
                        vcd.aktor = in.nextLine();
                    System.out.print("Sutradara\t: ");
                        vcd.sutradara = in.nextLine();
                    System.out.print("Publisher\t: ");
                        vcd.publisher = in.nextLine();
                    System.out.print("Kategori\t: ");
                        vcd.kategori = in.nextLine();
                    System.out.print("Stok\t\t: ");
                        vcd.stok = in.nextLine();

                    System.out.println();
                    vcdE.entriData(i, vcd);
                    i++;
                    break;
                }
                case "2" : {
                    System.out.println("\tCheck Data");
                    System.out.println("\t==========");
                    vcdE.print();
                    break;
                }
                case "3" : {
                    ulang = false;
                }
            }
        }
    }
    
}
