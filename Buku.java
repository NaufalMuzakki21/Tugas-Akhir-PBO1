public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private int harga;

    // Constructor
    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter untuk atribut
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method lainnya
    public void info() {
        System.out.println("ID: " + getId() + ", Judul: " + getJudul() + ", Penulis: " + getPenulis() + 
            ", Jumlah Halaman: " + getJumlahHalaman() + ", Harga: " + getHarga());
    }
}
