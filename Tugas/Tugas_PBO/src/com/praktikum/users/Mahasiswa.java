package com.praktikum.users;

import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

import java.util.Scanner;

public class Mahasiswa extends User {
    private String name;
    private String nim;

    public Mahasiswa(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() { return name; }
    public String getNim() { return nim; }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Lapor Barang");
            System.out.println("2. Lihat Barang yang Dilaporkan");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: {
                        reportItem(scanner);
                        System.out.println();
                        break;
                    }
                    case 2: {
                        viewReportedItems();
                        System.out.println();
                        break;
                    }
                    case 0: {
                        System.out.println("Logout...");
                        System.out.println();
                        break;
                    }
                    default: System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine(); // flush
                choice = -1;
            }
        } while (choice != 0);
    }

    public void reportItem(Scanner scanner) {
        System.out.print("Nama barang: ");
        String name = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String desc = scanner.nextLine();
        System.out.print("Lokasi: ");
        String loc = scanner.nextLine();
        Item item = new Item(name, desc, loc);
        LoginSystem.reportedItems.add(item);
        System.out.println("Barang berhasil dilaporkan.");
    }

    public void viewReportedItems() {
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
        } else {
            for (Item item : LoginSystem.reportedItems) {
                if (item.getStatus().equals("Reported") || item.getStatus().equals("Claimed")) {
                    System.out.println(item);
                }
            }
        }
    }
}