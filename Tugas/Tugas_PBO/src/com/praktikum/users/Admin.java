package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    Scanner input = new Scanner(System.in);
    private String nama;
    private String nim;
    private String inputDisplay;
    private String inputKonfirmasi;

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    final String USERNAME1 = "Admin013";
    final String PASSWORD1 = "Password013";

    @Override
    public void login(User user){
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
    public void displayInfo(User user) {
        System.out.println("Admin Berhasil!");
    }

    @Override
    public void displayAppMenu() {
        do {
            do {
                System.out.println("1. Kelola Laporan Barang");
                System.out.println("2. Kelola Data Mahasiswa");
                System.out.println("0. Logout");
                System.out.print("Masukkan plihan Anda: ");
                inputDisplay = input.nextLine();
                if (inputDisplay.equals("1")) {
                    manageItems();
                }
                else if (inputDisplay.equals("2")) {
                    manageUsers();
                }
                else if (inputDisplay.equals("0")) {
                    System.out.println("Terimakasih. . .");
                    break;
                } else {
                    System.out.println("Pilihan Anda Tidak Valid!");
                    System.out.println();
                }
            } while (!inputDisplay.equals("1") && !inputDisplay.equals("2") && !inputDisplay.equals("0"));
            if (!inputDisplay.equals("0")) {
                System.out.print("Apakah Anda Ingin Pindah ke Menu Lain?(1 = Ya, 2 = Tidak): ");
                inputKonfirmasi = input.nextLine();
                if (inputKonfirmasi.equals("2")) {
                    System.out.println("Baik. Program Dihentikan. Terimakasih . . .");
                    break;
                } else if (inputKonfirmasi.equals("1")) {
                    System.out.println();
                    System.out.println("Baik. Silahkan Pilih Kembali Menu di Bawah Ini:");
                }
            }
        } while (!inputDisplay.equals("0"));

    }

    @Override
    public void manageItems() {
        System.out.println(">>Fitur Kelola Barang Belum Tersedia<<");
        System.out.println();
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur Kelola Mahasiswa Belum Tersedia<<");
        System.out.println();
    }
}

/*
import java.util.Scanner;


public class com.praktikum.users.Admin {
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
            System.out.println("Login com.praktikum.users.Admin berhasil!");
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
                    System.out.println("Login com.praktikum.users.Admin berhasil!");
                }

            } while (!username.equals(USERNAME1) || !password.equals(PASSWORD1));
        }
    }
}
*/