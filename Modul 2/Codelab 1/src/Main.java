public class Main {
    public static void main(String[] args){
        Hewan kucing = new Hewan();
        Hewan anjing = new Hewan();

        kucing.nama = "Kucing";
        kucing.jenis = "Mamalia";
        kucing.suara = "Nyaaa~~";

        anjing.nama = "Anjing";
        anjing.jenis = "Mamalia";
        anjing.suara = "Woof Woof!!";

        kucing.tampilkanInfo();
        anjing.tampilkanInfo();
    }
}
