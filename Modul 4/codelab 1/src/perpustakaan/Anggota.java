package perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota){
        this.idAnggota = idAnggota;
        this.nama = nama;

        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
        System.out.println();
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println("Buku " + judul + " Dipinjam oleh " + nama);
    }
    public void pinjamBuku(String judul, int durasi){
        System.out.println("Buku " + judul + " Dipinjam selama " + durasi +" Hari oleh " + nama);
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println("Buku "+ judul +" Dikembalikan oleh " + nama );
    }
}