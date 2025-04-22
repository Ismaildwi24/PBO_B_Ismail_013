import java.util.Scanner;

public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    void login(User user){
        Scanner input = new Scanner(System.in);
        user.setNama(nama = input.nextLine());
        System.out.println("Masukkan Username: ");
        user.setNim(nim = input.nextLine());
        System.out.println("Masukkan Password: ");
    }

    void displayInfo(User user) {
        System.out.println("Login berhasil!");
        System.out.println("Informasi Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM: " + user.getNim());
    }
}
