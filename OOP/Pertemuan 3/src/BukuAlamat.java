public class BukuAlamat{
	private String nama;
	private String alamat;
	private String noTelp;
	private String email;

	public BukuAlamat(){
		setNama("Anonym");
		setAlamat("Not Found");
		setNoTelp("Nothing");
		setEmail("Nothing");
	}

	/************ Nama ************/
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}

	/************ Alamat ************/
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public String getAlamat(){
		return alamat;
	}

	/************ No Telp ************/
	public void setNoTelp(String noTelp){
		this.noTelp = noTelp;
	}
	public String getNoTelp(){
		return noTelp;
	}

	/************ Email ************/
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
}