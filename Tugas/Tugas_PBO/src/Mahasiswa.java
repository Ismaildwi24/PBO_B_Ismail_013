import java.util.Scanner;

public class Mahasiswa extends User{
    Scanner input = new Scanner(System.in);
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    final String USERNAME2 = "Ismail Dwi Muh. Anugerah";
    final String PASSWORD2 = "202410370110013";

    @Override
    void login(User user){
        System.out.print("Masukkan Username: ");
        nama = input.nextLine();
        user.setNama(nama);
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        user.setNim(nim);

        if (user.getNama().equals(USERNAME2) && user.getNim().equals(PASSWORD2))
            System.out.println("Login Mahasiswa berhasil!");
        else {
            do {
                System.out.println("Login gagal! Username atau NIM salah.");
                System.out.println("\nSilahkan isi kembali username dan NIM Anda!");
                System.out.print("Masukkan Username: ");
                nama = input.nextLine();
                user.setNama(nama);
                System.out.print("Masukkan NIM: ");
                nim = input.nextLine();
                user.setNim(nim);

                if (user.getNama().equals(USERNAME2) && user.getNim().equals(PASSWORD2))
                    System.out.println("Login Mahasiswa berhasil!");

            } while (!nama.equals(USERNAME2) || !nim.equals(PASSWORD2));
        }
    }

    @Override
    void displayInfo(User user) {
        System.out.println("Informasi Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM : " + user.getNim());
    }
}

/*
import java.util.Scanner;

public class Mahasiswa {
    Scanner scanner = new Scanner(System.in);
    String nama;
    String nim;

    final String USERNAME2 = "Ismail Dwi Muh. Anugerah";
    final String PASSWORD2 = "202410370110013";

    void login(){
        System.out.print("Masukkan username: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan password: ");
        nim = scanner.nextLine();

        if (nama.equals(USERNAME2) && nim.equals(PASSWORD2))
            System.out.println("Login Mahasiswa berhasil!");
        else {
            do {
                System.out.println("Login gagal! Username atau password salah.");
                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                System.out.print("Masukkan username: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan password: ");
                nim = scanner.nextLine();

                if (nama.equals(USERNAME2) && nim.equals(PASSWORD2))
                    System.out.println("Login Mahasiswa berhasil!");

            } while (!nama.equals(USERNAME2) || !nim.equals(PASSWORD2));
        }
    }

    void displayInfo() {
        System.out.println("Informasi Mahasiswa yang Login: ");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
*/