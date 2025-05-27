package com.praktikum.users;

import java.util.*;

import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

public class Admin extends User {

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Kelola Barang");
            System.out.println("2. Kelola Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: {
                        manageItems(scanner);
                        System.out.println();
                        break;
                    }
                    case 2: {
                        manageUsers(scanner);
                        System.out.println();
                        break;
                    }
                    case 0: {
                        System.out.println("Logout...");
                        System.out.println();
                        break;
                    }
                    default: System.out.println("Pilihan tidak valid."); //Gak Pake IndexOutOfBoundsException karena tidak berkaitan dengan indeks arraylist
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                choice = -1;
            }
        } while (choice != 0);
    }

    private void manageItems(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Kelola Barang ---");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Tandai Barang Sudah Diambil");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        for (Item item : LoginSystem.reportedItems) {
                            System.out.println(item);
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                            Item item = LoginSystem.reportedItems.get(i);
                            if (item.getStatus().equals("Reported")) {
                                System.out.println(i + ". " + item);
                            }
                        }
                        System.out.print("Masukkan indeks item: ");
                        try {
                            int index = scanner.nextInt();
                            scanner.nextLine();
                            Item item = LoginSystem.reportedItems.get(index);
                            item.setStatus("Claimed");
                            System.out.println("Status item berhasil diubah menjadi 'Claimed'.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indeks tidak valid.");
                        } catch (InputMismatchException e) {
                            System.out.println("Input harus berupa angka!");
                            scanner.nextLine();
                        }
                    }
                    case 0 -> {}
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                choice = -1;
            }
        } while (choice != 0);
    }

    private void manageUsers(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Kelola Mahasiswa ---");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: {
                        System.out.print("Nama Mahasiswa: ");
                        String name = scanner.nextLine();
                        System.out.print("NIM: ");
                        String nim = scanner.nextLine();
                        LoginSystem.userList.add(new Mahasiswa(name, nim));
                        System.out.println("Mahasiswa ditambahkan.");
                        break;
                    }
                    case 2: {
                        System.out.print("Masukkan NIM: ");
                        String nim = scanner.nextLine();
                        boolean found = false;
                        for (int i = 0; i < LoginSystem.userList.size(); i++) {
                            User user = LoginSystem.userList.get(i);
                            if (user instanceof Mahasiswa m && m.getNim().equals(nim)) {
                                LoginSystem.userList.remove(i);
                                found = true;
                                System.out.println("Mahasiswa dihapus.");
                                break;
                            }
                        }
                        if (!found) System.out.println("Mahasiswa tidak ditemukan.");
                        break;
                    }
                    case 0: {break;}
                    default: System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                choice = -1;
            }
        } while (choice != 0);
    }
}