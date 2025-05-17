package com.praktikum.actions;

import com.praktikum.manajemen.Barang;

import java.util.*;

public class tampilkanBarang {
    public static void tampilkanSemuaBarang(ArrayList<Barang> daftarBarang) {
        if (daftarBarang.isEmpty()) {
            System.out.println("Data Barang Kosong. Silahkan Tambah Barang Terlebih Dahulu");
        } else {
            Iterator<Barang> iterator = daftarBarang.iterator();
            while (iterator.hasNext()) {
                Barang barang = iterator.next();
                System.out.println("Nama Barang: " + barang.getNama() + ", Stok Barang: " + barang.getStok());
            }
        }
    }
}
