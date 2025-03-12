class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.printf("Nomor Rekening: %s\n", nomorRekening);
        System.out.printf("Nama Pemilik: %s\n", namaPemilik);
        System.out.printf("Saldo %.2f\n", saldo);
        System.out.println("\n");
    }
    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.printf(namaPemilik + " menyetorkan sebanyak: %.2f. Jumlah saldo sekarang: %.2f\n",jumlah, saldo );
    }
    void tarikTunai(double jumlah){
        System.out.printf(namaPemilik + " Menarik uang sebesar: %.2f\n", jumlah);
        if (saldo < jumlah)
            System.out.printf("(Gagal, Saldo tidak mencukupi), Saldo saat ini: %.2f\n", saldo);
        else if (saldo > jumlah) {
            saldo -= jumlah;
            System.out.printf("Tarik tunai Berhasil, Saldo saat ini: %.2f\n",saldo);
        }
    }
}
