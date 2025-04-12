<<<<<<< HEAD
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang " + target.getKesehatan());
    }
}
=======
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang " + target.getKesehatan());
    }
}
>>>>>>> 30e5a3c402f28df47355da90d596622effc86615
