/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String pilihanLogin;
        String username1;
        String password1;
        String username2;
        String password2;
        final String USERNAME1 = "Admin013";
        final String PASSWORD1 = "Password013";
        final String USERNAME2 = "Ismail Dwi Muh. Anugerah";
        final String PASSWORD2 = "202410370110013";

        do {

            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            pilihanLogin = scanner.nextLine();

            if (pilihanLogin.equals("1") || pilihanLogin.equals("2")) {
                switch (pilihanLogin) {
                    case "1":
                        System.out.print("Masukkan username: ");
                        username1 = scanner.nextLine();
                        System.out.print("Masukkan password: ");
                        password1 = scanner.nextLine();

                        if (username1.equals(USERNAME1) && password1.equals(PASSWORD1))
                            System.out.println("Login Admin berhasil!");
                        else {
                            do {
                                System.out.println("Login gagal! Username atau password salah.");
                                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                                System.out.print("Masukkan username: ");
                                username1 = scanner.nextLine();
                                System.out.print("Masukkan password: ");
                                password1 = scanner.nextLine();

                                if (username1.equals(USERNAME1) && password1.equals(PASSWORD1))
                                {
                                    System.out.println("Login Admin berhasil!");
                                }

                            } while (!username1.equals(USERNAME1) || !password1.equals(PASSWORD1));
                        }
                        break;

                    case "2":
                        System.out.print("Masukkan username: ");
                        username2 = scanner.nextLine();
                        System.out.print("Masukkan password: ");
                        password2 = scanner.nextLine();

                        if (username2.equals(USERNAME2) && password2.equals(PASSWORD2))
                            System.out.println("Login Mahasiswa berhasil!");
                        else {
                            do {
                                System.out.println("Login gagal! Username atau password salah.");
                                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                                System.out.print("Masukkan username: ");
                                username2 = scanner.nextLine();
                                System.out.print("Masukkan password: ");
                                password2 = scanner.nextLine();

                                if (username2.equals(USERNAME2) && password2.equals(PASSWORD2))
                                    System.out.println("Login Mahasiswa berhasil!");

                            } while (!username2.equals(USERNAME2) || !password2.equals(PASSWORD2));
                        }
                        break;
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                System.out.println("\nSilahkan masukkan kembali pilihan Anda!\n");
                continue;
            }
        } while (!pilihanLogin.equals("1") && !pilihanLogin.equals("2"));


    }
}
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pilihanLogin;

        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        do {

            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            pilihanLogin = scanner.nextLine();

            if (pilihanLogin.equals("1") || pilihanLogin.equals("2")) {
                switch (pilihanLogin) {
                    case "1":
                        admin.login();
                        break;

                    case "2":
                        mahasiswa.login();
                        System.out.println();
                        mahasiswa.displayInfo();
                        break;
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                System.out.println("\nSilahkan masukkan kembali pilihan Anda!\n");
                continue;
            }
        } while (!pilihanLogin.equals("1") && !pilihanLogin.equals("2"));


    }
}