package com.praktikum.actions;

import com.praktikum.exception.StokTidakCukupException;
import com.praktikum.manajemen.Barang;

import java.util.*;

public class kurangiStokBarang {
    public static void kurangiStokBarang(ArrayList<Barang> daftarBarang, Scanner scanner) {
        if (daftarBarang.isEmpty()) {
            System.out.println("Data Barang Kosong. Silahkan Tambah Barang Terlebih Dahulu");
            return;
        }

        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println(i + ". " + daftarBarang.get(i).getNama() + " - Stok: " + daftarBarang.get(i).getStok());
        }

        int indeks = 0;
        try {
            System.out.print("Masukkan Nomor Indeks Barang yang Akan Dikurangi Stoknya: ");
            indeks = scanner.nextInt();
            daftarBarang.get(indeks);
        } catch (InputMismatchException e) {
            System.out.println("Input Salah. Input Seharusnya Berupa Integer");
            scanner.nextLine();
            return;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks Barang Tidak Valid!");
            scanner.nextLine();
            return;
        }

        System.out.print("Masukkan Jumlah Stok yang Akan Diambil: ");
        int jumlahDiambil = 0;
        try {
            jumlahDiambil = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input Salah. Input Seharusnya Berupa Integer");
            scanner.nextLine();
            return;
        }

        Barang barang = daftarBarang.get(indeks);

        try {
            if (jumlahDiambil > barang.getStok()) {
                throw new StokTidakCukupException("Barang " + barang.getNama() + " Tidak Dapat Dikurangi, Stok Barang Tersisa " + barang.getStok());
            }
            barang.setStok(barang.getStok() - jumlahDiambil);
            System.out.println("Stok " + barang.getNama() + " Berhasil Dikurangi! Stok Barang Tersisa " + barang.getStok());
        } catch (StokTidakCukupException e) {
            System.out.println(e.getMessage());
        }


    }
}
