package perpustakaan;

public class NonFiksi extends Buku {
    private String topik;

    public NonFiksi (String judul, String penulis, String genre){
        super(judul, penulis);
        this.topik = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Buku: Non-Fiksi");
        System.out.println("Judul buku: " + judul);
        System.out.println("Nama Penulis: " + penulis);
        System.out.println("Genre: " + topik);
        System.out.println("----------------------------");
    }
}
