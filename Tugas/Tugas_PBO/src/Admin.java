import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;

    final String USERNAME1 = "Admin013";
    final String PASSWORD1 = "Password013";

    void login(){
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
