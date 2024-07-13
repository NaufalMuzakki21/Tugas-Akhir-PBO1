public class Novel extends Buku {
    private String genre;

    // Constructor
    public Novel() {
        super();
        System.out.println("Object Novel telah diciptakan");
    }

    // Getter dan Setter untuk atribut genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Method lainnya
    @Override
    public void info() {
        super.info();
        System.out.println("Genre: " + getGenre());
    }
}