import java.util.Scanner;

public class Admin extends User{
    Scanner input = new Scanner(System.in);
    String nama;
    String nim;

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    final String USERNAME1 = "Admin013";
    final String PASSWORD1 = "Password013";

    @Override
    void login(User user){
        System.out.print("Masukkan Username: ");
        nama = input.nextLine();
        user.setNama(nama);
        System.out.print("Masukkan Password: ");
        nim = input.nextLine();
        user.setNim(nim);

        if (user.getNama().equals(USERNAME1) && user.getNim().equals(PASSWORD1))
            System.out.println("Login Admin berhasil!");
        else {
            do {
                System.out.println("Login gagal! Username atau password salah.");
                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                System.out.print("Masukkan Username: ");
                nama = input.nextLine();
                user.setNama(nama);
                System.out.print("Masukkan Password: ");
                nim = input.nextLine();
                user.setNim(nim);

                if (user.getNama().equals(USERNAME1) && user.getNim().equals(PASSWORD1))
                {
                    System.out.println("Login Admin berhasil!");
                }

            } while (!user.getNama().equals(USERNAME1) || !user.getNim().equals(PASSWORD1));
        }
    }

    @Override
    void displayInfo(User user) {
        System.out.println("Login Admin Berhasil!");
    }
}

/*
import java.util.Scanner;


public class Admin {
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;

    final String USERNAME1 = "Admin013";
    final String PASSWORD1 = "Password013";

    void login(){
        System.out.print("Masukkan username: ");
        username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        password = scanner.nextLine();

        if (username.equals(USERNAME1) && password.equals(PASSWORD1))
            System.out.println("Login Admin berhasil!");
        else {
            do {
                System.out.println("Login gagal! Username atau password salah.");
                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                System.out.print("Masukkan username: ");
                username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                password = scanner.nextLine();

                if (username.equals(USERNAME1) && password.equals(PASSWORD1))
                {
                    System.out.println("Login Admin berhasil!");
                }

            } while (!username.equals(USERNAME1) || !password.equals(PASSWORD1));
        }
    }
}
*/