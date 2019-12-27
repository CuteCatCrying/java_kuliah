import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    private BukuAlamat[] bukuAlamat = new BukuAlamat[100];

    public void insert(int index, BukuAlamat bukuAlamat){
        this.bukuAlamat[index] = bukuAlamat;
    }

    public void update(String nama, BukuAlamat bukuAlamat) throws IOException{
        for(int i=0; i<this.bukuAlamat.length; i++){
            if(this.bukuAlamat[i] != null){
                if(this.bukuAlamat[i].getNama().equalsIgnoreCase(nama)){
                    bukuAlamat.setNama(this.bukuAlamat[i].getNama());
                    this.bukuAlamat[i] = bukuAlamat;
                }else{
                    System.out.println("Data tidak ditemukan atau tidak ada");
                }
            }
        }
    }

    public void delete(int index){
        for(int i=index; i<bukuAlamat.length; i++){
            if(bukuAlamat[i] != null){
                bukuAlamat[i] = bukuAlamat[i+1];
            }
        }
    }

    public void print(){
        for(int i=0; i<bukuAlamat.length; i++){
            if(bukuAlamat[i] != null){
                System.out.println("Data ke --> "+(i+1));
                System.out.println("Nama      : " + bukuAlamat[i].getNama());
                System.out.println("Alamat    : " + bukuAlamat[i].getAlamat());
                System.out.println("No Telp   : " + bukuAlamat[i].getNoTelp());
                System.out.println("Email     : " + bukuAlamat[i].getEmail());
                System.out.println("========================================");
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        Main M = new Main();

        String pilihanUser;
        String cariNama;
        int banyakData, hapusData;
        boolean ulang = true;

        while(ulang){
            System.out.print("\n");
            System.out.println("====== Menu Pilihan ======");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Print Data");
            System.out.println("5. Keluar");
            System.out.println("==========================");
            System.out.print("Pilih ? ");
                pilihanUser = dataIn.readLine();

            switch(pilihanUser){
                case "1":{
                    System.out.println("\t1. Insert Data");
                    System.out.print("Banyak data : ");
                        banyakData = Integer.valueOf(dataIn.readLine()); // konversi string ke integer
                    for(int i=0; i<banyakData; i++){
                        BukuAlamat ba = new BukuAlamat();

                        System.out.println("Data ke ---> "+(i+1));
                        System.out.print("Entri Nama\t:");
                            ba.setNama(dataIn.readLine());
                        System.out.print("Entri Alamat\t:");
                            ba.setAlamat(dataIn.readLine());
                        System.out.print("Entri No Telp\t:");
                            ba.setNoTelp(dataIn.readLine());
                        System.out.print("Entri Email\t:");
                            ba.setEmail(dataIn.readLine());

                        System.out.print("\n");
                        M.insert(i,ba);
                    }
                    break;
                }
                case "2":{
                    BukuAlamat ba = new BukuAlamat();

                    System.out.println("\t2. Update Data");
                    System.out.print("Nama yang diupdate : ");
                        cariNama = dataIn.readLine();
                    System.out.print("Entri Alamat\t:");
                        ba.setAlamat(dataIn.readLine());
                    System.out.print("Entri No Telp\t:");
                        ba.setNoTelp(dataIn.readLine());
                    System.out.print("Entri Email\t:");
                        ba.setEmail(dataIn.readLine());
                    M.update(cariNama,ba);
                    break;
                }
                case "3":{
                    System.out.println("\t3. Delete Data");
                    System.out.print("Data Ke : ");
                        hapusData = Integer.valueOf(dataIn.readLine());
                    hapusData -= 1; // karena index mulai dari 0 
                    M.delete(hapusData);
                    break;
                }
                case "4":{
                    System.out.println("\t4. Print Data");
                    M.print();
                    break;
                }
                case "5":{
                    System.out.println("\t5. Keluar");
                    ulang = false;
                    break;
                }
                default:{
                    ulang = true;
                }
            }
        }
    }
}