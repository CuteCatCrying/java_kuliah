package javaapplication1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class VCDExampleV2 {
    private final static VCD[] vcd = new VCD[10];
    private final static List<Aktor> aktor_list = new ArrayList<Aktor>();
    private final static List<Sutradara> sutradara_list = new ArrayList<Sutradara>();
    private final static List<Publisher> publisher_list = new ArrayList<Publisher>();
    private final static List<Kategori> kategori_list = new ArrayList<Kategori>();

    
    private Aktor getAktor(String value){
        Aktor[] aktor = {
                            new Aktor("Andi", "Padang"),
                            new Aktor("Reita", "Sumba"),
                            new Aktor("Zera", "Banjar"),
                            new Aktor("Rezu", "Aceh")
                        };
        for(int i=0; i<aktor.length; i++){
            aktor_list.add(aktor[i]);
        }
        
        for(Aktor a : aktor_list){
            if(value.equalsIgnoreCase(a.getNama())){
                return a;
            }
        }
        return new Aktor("Nama Aktor Tidak Ada", "Alamat Aktor Tidak Ada");
    }
    
    private Sutradara getSutradara(String value){
        Sutradara[] sutradara = {
                            new Sutradara("Budi", "Padang"),
                            new Sutradara("Otong", "Bali"),
                            new Sutradara("Ucup", "Denpasar"),
                            new Sutradara("Ropeah", "Lombok")
                        };
        for(int i=0; i<sutradara.length; i++){
            sutradara_list.add(sutradara[i]);
        }
        
        for(Sutradara s : sutradara_list){
            if(value.equalsIgnoreCase(s.getNama())){
                return s;
            }
        }
        return new Sutradara("Nama Sutradara Tidak Ada", "Alamat Sutradara Tidak Ada");
    }
    
    private Publisher getPublisher(String value){
        Publisher[] publisher = {
                            new Publisher("PT ABC", "Padang"),
                            new Publisher("Sony", "Bogor"),
                            new Publisher("Marvel", "Palu"),
                            new Publisher("Ubisoft", "Tanggerang")
                        };
        for(int i=0; i<publisher.length; i++){
            publisher_list.add(publisher[i]);
        }
        
        for(Publisher p : publisher_list){
            if(value.equalsIgnoreCase(p.getNama())){
                return p;
            }
        }
        return new Publisher("Nama Publisher Tidak Ada", "Alamat Publisher Tidak Ada");
    }
    
    private Kategori getKategori(String value){
        Kategori[] kategori = {
                            new Kategori("SU", "Semua Umur"),
                            new Kategori("D", "Dewasa"),
                            new Kategori("R", "Remaja"),
                            new Kategori("BO", "Bimbingan Orang Tua")
                        };
        for(int i=0; i<kategori.length; i++){
            kategori_list.add(kategori[i]);
        }
        
        for(Kategori k : kategori_list){
            if(value.equalsIgnoreCase(k.getKode())){
                return k;
            }
        }
        return new Kategori("Kode Kategori Tidak Ada", "Nama Kategori Tidak Ada");
    }
    
    public void entriData(int i, VCD vcd){
        this.vcd[i] = vcd;
    }
    
    public void showData(){
        for(int i=0; i<vcd.length; i++){
            if(vcd[i] != null){
                    System.out.println("Data ke-" + (i+1));
            System.out.println("==========================");
            System.out.println("||\tRental VCD\t||");
            System.out.println("|| Judul\t: " + vcd[i].getJudul());
            System.out.println("|| Aktor");
            System.out.println("|| ->> Nama\t: " + vcd[i].getAktor().getNama());
            System.out.println("|| ->> Alamat\t: " + vcd[i].getAktor().getAlamat());
            System.out.println("|| Sutradara");
            System.out.println("|| ->> Nama\t: " + vcd[i].getSutradara().getNama());
            System.out.println("|| ->> Alamat\t: " + vcd[i].getSutradara().getAlamat());
            System.out.println("|| Publisher");
            System.out.println("|| ->> Nama\t: " + vcd[i].getPublisher().getNama());
            System.out.println("|| ->> Alamat\t: " + vcd[i].getPublisher().getAlamat());
            System.out.println("|| Kategori");
            System.out.println("|| ->> Kode\t: " + vcd[i].getKategori().getKode());
            System.out.println("|| ->> Nama\t: " + vcd[i].getKategori().getNama());
            System.out.println("|| Stok\t: " + vcd[i].getStok());
            System.out.println("==========================");
            }
        }
    }

    
    public static void main(String[] args) {
        VCDExampleV2 vcdE = new VCDExampleV2();
        Scanner in = new Scanner(System.in);
        String pilihanUser;
        boolean ulang = true;
        int dataKe = 0;
        Aktor namaAktor;
        Sutradara namaSutradara;
        Publisher namaPublisher;
        Kategori kodeKategori;
        
        while(ulang){
            System.out.println("==========================");
            System.out.println("||\tRental VCD\t||");
            System.out.println("|| 1. Entri Data\t||");
            System.out.println("|| 2. Tampilkan Data\t||");
            System.out.println("|| 3. Keluar\t\t||");
            System.out.println("==========================");
            System.out.print("Pilih ? ");
                pilihanUser = in.next();
            
            in.nextLine(); // Clearing Buffer
            switch(pilihanUser){
                case "1" : {
                    VCD vcdInput = new VCD();
                    
                    System.out.println("==========================");
                    System.out.println("|| 1. Entri Data\t||");
                    System.out.print("|| Judul\t\t: ");
                        vcdInput.setJudul(in.nextLine());
                    System.out.print("|| Nama Aktor\t\t: ");
                        namaAktor = vcdE.getAktor(in.nextLine());
                        vcdInput.setAktor(namaAktor);
                    System.out.print("|| Nama Sutradara\t: ");
                        namaSutradara = vcdE.getSutradara(in.nextLine());
                        vcdInput.setSutradara(namaSutradara);
                    System.out.print("|| Nama Publisher\t: ");
                        namaPublisher = vcdE.getPublisher(in.nextLine());
                        vcdInput.setPublisher(namaPublisher);
                    System.out.print("|| Kode Kategori\t: ");
                        kodeKategori = vcdE.getKategori(in.nextLine());
                        vcdInput.setKategori(kodeKategori);
                    System.out.print("|| Stok\t\t\t: ");
                        vcdInput.setStok(in.nextInt());
                    
                    vcdE.entriData(dataKe, vcdInput);
                    dataKe++;
                    break;
                }
                
                case "2" : {
                    System.out.println("==========================");
                    System.out.println("|| 2. Tampilkan Data\t||");
                    vcdE.showData();
                    
                    break;
                }
                
                case "3" : {
                    System.out.println("==========================");
                    System.out.println("|| 3. Keluar\t\t||");
                    System.out.println("==========================");
                    ulang = false;
                    break;
                }
            }
        }

        
        
        
        
        
        
        
    }
}
