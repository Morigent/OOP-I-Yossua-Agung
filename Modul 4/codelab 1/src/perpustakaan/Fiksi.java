package perpustakaan;

public class Fiksi extends Buku {
    private String genre;
    public Fiksi (String judul, String penulis, String genre){
        super(judul, penulis);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Buku: Fiksi");
        System.out.println("Judul buku: " + judul);
        System.out.println("Nama Penulis: " + penulis);
        System.out.println("Genre: " + genre);
        System.out.println("----------------------------");
    }
}
