package perpustakaan;

public abstract class Buku {
    String judul;
    String penulis;

    public Buku (String judul, String penulis){
        this.penulis = penulis;
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public void displayInfo(){
       //kosong
    }
}
