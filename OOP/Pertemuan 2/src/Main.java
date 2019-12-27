public class Main{
	public static void main(String[] args) {
		BukuAlamat[] Ba = new BukuAlamat[100]; //Mendeklarasikan objek array yang berisikan 100 data

		Ba[0] = new BukuAlamat(); // Membuat objek baru dengan index 0
		Ba[1] = new BukuAlamat(); // Membuat objek baru dengan index 1

		Ba[0].setNama("Zukron Alviandy Rahmadhan");
		Ba[0].setAlamat("Dibumi lah");
		Ba[0].setNoTelp("Dihp");
		Ba[0].setEmail("Diakun gugel");

		Ba[1].setNama("Otong Surotong");
		// set alamat, notelp, email tidak diset karena konstruktor default nnti yang akan mengisi

		Ba[0].printBukuAlamat(); // Mencetak buku alamat memakai method yng sudah dibuat di kelas buku alamat
		Ba[1].printBukuAlamat();
	}
}