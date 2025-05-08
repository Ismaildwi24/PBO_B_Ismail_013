package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pilihanLogin;

        User user1 = new Admin("Admin013", "Password013");
        User user2 = new Mahasiswa("Ismail Dwi Muh. Anugerah", "202410370110013");

        do {

            System.out.println("Pilihan login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            pilihanLogin = scanner.nextLine();

            if (pilihanLogin.equals("1") || pilihanLogin.equals("2")) {
                switch (pilihanLogin) {
                    case "1":
                        user1.login(user1);
                        System.out.println();
                        user1.displayAppMenu();
                        break;

                    case "2":
                        user2.login(user2);
                        System.out.println();
                        user2.displayInfo(user2);
                        System.out.println();
                        user2.displayAppMenu();
                        break;
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                System.out.println("\nSilahkan masukkan kembali pilihan Anda!\n");
            }
        } while (!pilihanLogin.equals("1") && !pilihanLogin.equals("2"));
    }
}

/*
package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pilihanLogin;

        User user1 = new Admin("Admin013", "Password013");
        User user2 = new Mahasiswa("Ismail Dwi Muh. Anugerah", "202410370110013");

        do {

            System.out.println("Pilihan login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            pilihanLogin = scanner.nextLine();

            if (pilihanLogin.equals("1") || pilihanLogin.equals("2")) {
                switch (pilihanLogin) {
                    case "1":
                        user1.login(user1);
                        break;

                    case "2":
                        user2.login(user2);
                        System.out.println();
                        user2.displayInfo(user2);
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
            System.out.println("1. com.praktikum.users.Admin");
            System.out.println("2. com.praktikum.users.Mahasiswa");
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
                            System.out.println("Login com.praktikum.users.Admin berhasil!");
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
                                    System.out.println("Login com.praktikum.users.Admin berhasil!");
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
                            System.out.println("Login com.praktikum.users.Mahasiswa berhasil!");
                        else {
                            do {
                                System.out.println("Login gagal! Username atau password salah.");
                                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                                System.out.print("Masukkan username: ");
                                username2 = scanner.nextLine();
                                System.out.print("Masukkan password: ");
                                password2 = scanner.nextLine();

                                if (username2.equals(USERNAME2) && password2.equals(PASSWORD2))
                                    System.out.println("Login com.praktikum.users.Mahasiswa berhasil!");

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

