package com.praktikum.manajemen;

import java.util.*;

import static com.praktikum.actions.kurangiStokBarang.kurangiStokBarang;
import static com.praktikum.actions.tambahBarang.*;
import static com.praktikum.actions.tampilkanBarang.tampilkanSemuaBarang;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Laptop", 10));
        daftarBarang.add(new Barang("Mouse", 25));
        daftarBarang.add(new Barang("Keyboard", 15));

        while (true) {
            System.out.println("\n=== Menu Manajemen Stok ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu (0-3): ");

            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input Salah. Input Seharusnya Berupa Integer");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahBarangBaru(daftarBarang, scanner);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("--- Daftar Barang ---");
                    tampilkanSemuaBarang(daftarBarang);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                    kurangiStokBarang(daftarBarang, scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Inputan Tidak Valid!");
            }
        }
    }
}
