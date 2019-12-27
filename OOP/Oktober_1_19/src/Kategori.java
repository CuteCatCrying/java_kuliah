public class Kategori {
    private String kode;
    private String nama;
    
    public Kategori(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }
}