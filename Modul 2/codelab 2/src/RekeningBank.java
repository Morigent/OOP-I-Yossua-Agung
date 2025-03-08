
class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.printf("Nomor Rekening: %s\n", nomorRekening);
        System.out.printf("Nama Pemilik: %s\n", namaPemilik);
        System.out.printf("Saldo %f\n", saldo);
        System.out.println("\n");
    }
    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetorkan sebanyak: " + jumlah + ". Jumlah saldo sekarang: " + saldo );
    }
    void tarikTunai(double jumlah){
        System.out.println(namaPemilik + " Menarik uang sebesar: " + jumlah);
        if (saldo < jumlah)
            System.out.println("(Gagal, Saldo tidak mencukupi), Saldo saat ini: " + saldo);
        else if (saldo > jumlah) {
            saldo -= jumlah;
            System.out.printf("Tarik tunai Berhasil, Saldo saat ini: " + saldo);
        }
    }
}
