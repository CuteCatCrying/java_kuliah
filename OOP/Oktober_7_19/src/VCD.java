public class VCD {
    private String judul;
    private Aktor aktor;
    private Sutradara sutradara;
    private Publisher publisher;
    private Kategori kategori;
    private int stok;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Aktor getAktor() {
        return aktor;
    }

    public void setAktor(Aktor aktor) {
        this.aktor = aktor;
    }

    public Sutradara getSutradara() {
        return sutradara;
    }

    public void setSutradara(Sutradara sutradara) {
        this.sutradara = sutradara;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
