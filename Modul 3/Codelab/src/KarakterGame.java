public class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }
    public String getNama(){
        return nama;
    }
    //setter nama
    public void setNama (String nama){
        this.nama = nama;
    }
    //setter kesehatan
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    //getter kesehatan
    public int getKesehatan (){
        return kesehatan;
    }
    void serang(KarakterGame target){
        System.out.println(nama + "Menyerang " + target.getNama()+"!");
    }

}

