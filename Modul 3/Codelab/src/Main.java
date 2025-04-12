public class Main {
    public static void main(String[] args) {
        KarakterGame karakterUmum =  new KarakterGame ("Karakter Umum", (byte) 100);
        pahlawan brimstone =  new pahlawan("Brimstone",150);
        Musuh viper =  new Musuh("Viper", 200);

        System.out.println("Status awal: ");
        System.out.println(brimstone.getNama() + " memiliki " + brimstone.getKesehatan() + " health");
        System.out.println(viper.getNama() + " memiliki " + viper.getKesehatan() + " health");
        System.out.println();

        System.out.println("Pertarungan dimulai");
        brimstone.serang(viper);
        System.out.printf("OPEN UP THE SKYYYY!!!!!");
        viper.serang(brimstone);
        System.out.printf("DON'T GET IN MY WAY!!");
    }
}