public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    // Constructor
    public Tamu() {
        super();
        System.out.println("Object Tamu telah diciptakan");
    }

    // Getter dan Setter untuk atribut sisaMasaAktif
    public int getSisaMasaAktif() {
        return sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    // Method khusus untuk Tamu
    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    @Override
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE id=" + getId() + " AND status='Tamu'");
    }

    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}