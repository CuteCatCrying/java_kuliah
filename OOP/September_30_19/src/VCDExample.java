import java.util.Scanner;

public class VCDExample {
	private static VCD[] vcd = new VCD[10];
	private static Aktor[] aktor = new Aktor[4];
	private static Sutradara[] sutradara = new Sutradara[4];
	private static Publisher[] publisher = new Publisher[4];
	private static Kategori[] kategori = new Kategori[4];
	private static VCDExample vcdE = new VCDExample();
	private static Scanner in = new Scanner(System.in);

	public void entriData(int i, VCD vcd){
		this.vcd[i] = vcd;
	}

	public Aktor pilihAktor(){
		int pilih;

        aktor[0] = new Aktor("Andi", "Padang");
        aktor[1] = new Aktor("Reita", "Sumba");
        aktor[2] = new Aktor("Zera", "Banjar");
        aktor[3] = new Aktor("Rezu", "Aceh");

        for(int i=0; i<aktor.length; i++){
	        System.out.println((i+1) + ") Nama : " + aktor[i].getNama() + ", \tAlamat : " + aktor[i].getAlamat());
        }
        System.out.print("Pilih Aktor : ");
        	pilih = in.nextInt();

        if(pilih <= aktor.length){
			return aktor[pilih-1];
        }else{
        	return new Aktor(null, null); // jika user memilih nama aktor yang lebih dari 4 maka akan mengembalikan nilai null
        }
	}
	
	public Sutradara pilihSutradara(){
		int pilih;

        sutradara[0] = new Sutradara("Budi", "Padang");
        sutradara[1] = new Sutradara("Otong", "Bali");
        sutradara[2] = new Sutradara("Ucup", "Denpasar");
        sutradara[3] = new Sutradara("Ropeah", "Lombok");

        for(int i=0; i<sutradara.length; i++){
	        System.out.println((i+1) + ") Nama : " + sutradara[i].getNama() + ", \tAlamat : " + sutradara[i].getAlamat());
        }
        System.out.print("Pilih Sutradara : ");
        	pilih = in.nextInt();

        if(pilih <= sutradara.length){
			return sutradara[pilih-1];
        }else{
        	return new Sutradara(null, null); // jika user memilih nama sutradara yang lebih dari 4 maka akan mengembalikan nilai null
        }
	}

	public Publisher pilihPublisher(){
		int pilih;

        publisher[0] = new Publisher("PT ABC", "Padang");
        publisher[1] = new Publisher("Sony", "Bogor");
        publisher[2] = new Publisher("Marvel", "Palu");
        publisher[3] = new Publisher("Ubisoft", "Tanggerang");

        for(int i=0; i<publisher.length; i++){
	        System.out.println((i+1) + ") Nama : " + publisher[i].getNama() + ", \tAlamat : " + publisher[i].getAlamat());
        }
        System.out.print("Pilih Publisher : ");
        	pilih = in.nextInt();

        if(pilih <= publisher.length){
			return publisher[pilih-1];
        }else{
        	return new Publisher(null, null); // jika user memilih nama publisher yang lebih dari 4 maka akan mengembalikan nilai null
        }
	}

	public Kategori pilihKategori(){
		int pilih;

        kategori[0] = new Kategori("SU", "Semua Umur");
        kategori[1] = new Kategori("D", "Dewasa");
        kategori[2] = new Kategori("R", "Remaja");
        kategori[3] = new Kategori("BO", "Bimbingan Orang Tua");

        for(int i=0; i<kategori.length; i++){
	        System.out.println((i+1) + ") Kode : " + kategori[i].getKode() + ", \t\tNama : " + kategori[i].getNama());
        }
        System.out.print("Pilih Kategori : ");
        	pilih = in.nextInt();

        if(pilih <= kategori.length){
			return kategori[pilih-1];
        }else{
        	return new Kategori(null, null); // jika user memilih nama kategori yang lebih dari 4 maka akan mengembalikan nilai null
        }
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
    	String pilihanUser;
    	boolean ulang = true;
    	int banyakData;

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
			        VCD vcd = new VCD();
			        banyakData = 0;

			        System.out.println("==========================");
			        System.out.println("|| 1. Entri Data\t||");
			        System.out.print("Judul\t: ");
			        	vcd.setJudul(in.nextLine());
						vcd.setAktor(vcdE.pilihAktor());
				        vcd.setSutradara(vcdE.pilihSutradara());
				        vcd.setPublisher(vcdE.pilihPublisher());
				        vcd.setKategori(vcdE.pilihKategori());	
				    System.out.print("Stok\t : ");
				    	vcd.setStok(in.nextInt());

				    vcdE.entriData(banyakData, vcd);
				    banyakData++;

	        		break;
	        	}
	        	case "2" : {
	        		vcdE.showData();
	        		break;
	        	}
	        	case "3" : {
	        		ulang = false;
	        		break;
	        	}
	        }
	    }
    }
}
