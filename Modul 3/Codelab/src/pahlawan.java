public class pahlawan extends KarakterGame {
    public pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang " + target.getKesehatan());
    }
}
