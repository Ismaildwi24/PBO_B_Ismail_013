package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    Scanner input = new Scanner(System.in);
    private String nama;
    private String nim;
    private String namaBarang;
    private String deskripsiBarang;
    private String lokasiTerakhir;
    private String inputDisplay;
    private String inputKonfirmasi;
    private String inputPindahMenu;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    final String USERNAME2 = "Ismail Dwi Muh. Anugerah";
    final String PASSWORD2 = "202410370110013";

    @Override
    public void login(User user){
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
    public void displayAppMenu() {
        do {
            do {
                System.out.println("1. Laporkan Barang Temuan/Hilang");
                System.out.println("2. Lihat Data Laporan");
                System.out.println("0. Logout");
                System.out.print("Masukkan plihan Anda: ");
                inputDisplay = input.nextLine();
                if (inputDisplay.equals("1")) {
                    reportItem();
                }
                else if (inputDisplay.equals("2")) {
                    viewReportedItems();
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
                inputPindahMenu = input.nextLine();
                if (inputPindahMenu.equals("2")) {
                    System.out.println("Baik. Program Dihentikan. Terimakasih . . .");
                    break;
                } else {
                    System.out.println();
                    System.out.println("Silahkan Pilih Kembali Menu Di Bawah Ini:");
                }
            }

        } while (!inputDisplay.equals("0"));

    }

    @Override
    public void displayInfo(User user) {
        System.out.println("Informasi Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM : " + user.getNim());
    }

    @Override
    public void reportItem() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Isi Detail Barang yang Dilaporkan! ");
            System.out.print("Masukkan Nama Barang: ");
            namaBarang = scanner.nextLine();
            System.out.print("Deskripsikan Barang: ");
            deskripsiBarang = scanner.nextLine();
            System.out.print("Lokasi Terakhir Barang: ");
            lokasiTerakhir = scanner.nextLine();
            System.out.println();
            System.out.println("Mohon Periksa Kembali Barang yang Dilaporkan!");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Deskripsi Barang: " + deskripsiBarang);
            System.out.println("Lokasi Terakhir Barang: " + lokasiTerakhir);
            System.out.print("Apakah informasi sudah tepat? (1 = Ya, 2 = Belum): ");
            inputKonfirmasi = scanner.nextLine();
            if (inputKonfirmasi.equals("1")) {
                System.out.println();
                System.out.println("Data Barang Temuan/Hilang Telah Tersimpan!");
                System.out.println();
            }
        } while (inputKonfirmasi.equals("2"));

    }

    @Override
    public void viewReportedItems() {
        System.out.println(">>Fitur Lihat Laporan Belum Tersedia<<");
        System.out.println();
    }
}

/*
package com.praktikum.users;

import java.util.Scanner;

public class Mahasiswa extends User {
    Scanner input = new Scanner(System.in);
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    final String USERNAME2 = "Ismail Dwi Muh. Anugerah";
    final String PASSWORD2 = "202410370110013";

    @Override
    public void login(User user){
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
    public void displayInfo(User user) {
        System.out.println("Informasi Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM : " + user.getNim());
    }
}
 */

/*
import java.util.Scanner;

public class com.praktikum.users.Mahasiswa {
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
            System.out.println("Login com.praktikum.users.Mahasiswa berhasil!");
        else {
            do {
                System.out.println("Login gagal! Username atau password salah.");
                System.out.println("\nSilahkan isi kembali username dan password Anda!");
                System.out.print("Masukkan username: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan password: ");
                nim = scanner.nextLine();

                if (nama.equals(USERNAME2) && nim.equals(PASSWORD2))
                    System.out.println("Login com.praktikum.users.Mahasiswa berhasil!");

            } while (!nama.equals(USERNAME2) || !nim.equals(PASSWORD2));
        }
    }

    void displayInfo() {
        System.out.println("Informasi com.praktikum.users.Mahasiswa yang Login: ");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
*/