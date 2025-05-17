package com.praktikum.actions;

import com.praktikum.manajemen.Barang;

import java.util.*;


public class tambahBarang extends Barang {

    public tambahBarang(String nama, int stok) {
        super(nama, stok);
    }

    public static void tambahBarangBaru(ArrayList<Barang> daftarBarang, Scanner scanner) {
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.next();
        System.out.print("Masukkan Stok Barang: ");
        int stok = 0;

        try {
            stok = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input Salah. Input Seharusnya Berupa Integer");
            scanner.nextLine();
            return;
        }

        daftarBarang.add(new Barang(nama, stok));
        System.out.println("Barang Berhasil Ditambahkan!");
    }
}
