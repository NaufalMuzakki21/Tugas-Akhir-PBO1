public class Main {
    public static void main(String[] args) {
        // Pengguna
        Pengguna pengguna = new Pengguna();
        pengguna.setId(1);
        pengguna.setUsername("Admin1");
        pengguna.setPassword("Admin#1234");

        // Tamu
        Tamu tamu = new Tamu();
        tamu.setId(2);
        tamu.setUsername("user1");
        tamu.setPassword("User1234");
        tamu.setSisaMasaAktif(30);
        tamu.menambahMasaAktif(5);

        // Buku
        Buku buku = new Buku();
        buku.setId(1);
        buku.setJudul("Dilan:Dia adalah Dilanku 1990");
        buku.setPenulis("Pidi Baiq");
        buku.setJumlahHalaman(333);
        buku.setHarga(69000);

        // Novel
        Novel novel = new Novel();
        novel.setId(2);
        novel.setJudul("Laskar Pelangi");
        novel.setPenulis("Andrea Hirata");
        novel.setJumlahHalaman(529);
        novel.setHarga(160000);
        novel.setGenre("Fiksi");

        // Komik
        Komik komik = new Komik();
        komik.setId(3);
        komik.setJudul("Detektif Konan");
        komik.setPenulis("Gosho Aoyama");
        komik.setJumlahHalaman(184);
        komik.setHarga(52000);
        komik.setIlustrator("Gosho Aoyama");

        // Tampilkan informasi untuk setiap objek
        System.out.println("Pengguna:");
        System.out.println("ID: " + pengguna.getId());
        System.out.println("Username: " + pengguna.getUsername());
        System.out.println("Password: " + pengguna.getPassword());

        System.out.println("\nTamu:");
        System.out.println("ID: " + tamu.getId());
        System.out.println("Username: " + tamu.getUsername());
        System.out.println("Password: " + tamu.getPassword());
        System.out.println("Sisa Masa Aktif: " + tamu.getSisaMasaAktif());
        tamu.login();
        tamu.hapus();

        System.out.println("\nBuku:");
        buku.info();

        System.out.println("\nNovel:");
        novel.info();

        System.out.println("\nKomik:");
        komik.info();
    }
}
