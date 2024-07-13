public class Komik extends Buku {
    private String ilustrator;

    // Constructor
    public Komik() {
        super();
        System.out.println("Object Komik telah diciptakan");
    }

    // Getter dan Setter untuk atribut ilustrator
    public String getIlustrator() {
        return ilustrator;
    }

    public void setIlustrator(String ilustrator) {
        this.ilustrator = ilustrator;
    }

    // Method lainnya
    @Override
    public void info() {
        super.info();
        System.out.println("Ilustrator: " + getIlustrator());
    }
}
