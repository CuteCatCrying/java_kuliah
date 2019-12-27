import java.util.Scanner;

public class MainV2{
	private static int banyakData2; // membuat getter dan setter banyak data karena banyak data bersifat scope blok

	private static void setBanyakData(int banyakData){
		banyakData2 = banyakData;
	}
	private static int getBanyakData(){
		return banyakData2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BukuAlamat[] Ba = new BukuAlamat[100]; //Mendeklarasikan objek array yang berisikan 100 data
		String pilihanUser;
		String cariNama;
		boolean ulang = true;

		while(ulang){
			System.out.println("\tCttn : Input nama dengan alamat tidak bisa memakai spasi");
			System.out.print("\n");
			System.out.println("1. Tambah Data");
			System.out.println("2. Cek Data Spesifik");
			System.out.println("3. Cek Data Semua");
			System.out.println("4. Keluar");
			System.out.print("Pilih ? ");
				pilihanUser = in.next();

			System.out.print("\n");
			switch(pilihanUser){
				case "1":{
					System.out.println("\t1. Tambah Data");
					System.out.println("Data yang ditambahkan maks 100 Data");
					System.out.print("Banyak Data Baru : ");
						setBanyakData(in.nextInt());
					for(int i=0; i<getBanyakData(); i++){
						Ba[i] = new BukuAlamat();
						System.out.print("Nama      : ");
							Ba[i].setNama(in.next());
						System.out.print("Alamat    : ");
							Ba[i].setAlamat(in.next());
						System.out.print("No Telp   : ");
							Ba[i].setNoTelp(in.next());
						System.out.print("Email     : ");
							Ba[i].setEmail(in.next());

						System.out.print("\n");
					}
					break;
				}
				case "2":{
					System.out.println("2. Cek Data Spesifik");
					System.out.print("Cari nama : ");
						cariNama = in.next();
					for(int i=0; i<getBanyakData(); i++){
						if(Ba[i].getNama().equals(cariNama)){
							System.out.print("\n");
							Ba[i].printBukuAlamat();
						}
					}
					break;
				}
				case "3":{
					System.out.println("3. Cek Data Semua");
					for(int i=0; i<getBanyakData(); i++){
						System.out.println("Data Ke-"+(i+1));
						Ba[i].printBukuAlamat();
					}
					break;
				}
				case "4":{
					ulang = false;
					break;
				}
				default : {
					ulang = true;
				}
			}
		}
	}
}