public class Mahasiswa {
    String nama;
    String nim;
    boolean login = false;
    Scanner input = new Scanner(System.in);

    void login(String inputNama, String inputNIM){


        if (nama.equalsIgnoreCase(inputNama) & nim.equalsIgnoreCase(inputNIM))
            login = true;
    }

    void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.printf("NIM: " + nim);
    }
}
