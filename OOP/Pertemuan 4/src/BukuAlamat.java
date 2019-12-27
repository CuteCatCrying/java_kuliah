public class BukuAlamat {
    private String nama ;
    private String alamat;
    private String noTelp;
    private String email;

    public BukuAlamat(){
        nama   = "Anonym";
        alamat = "disana";
        noTelp = "0822344556";
        email  = "anonym@rocketmail.com";
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
