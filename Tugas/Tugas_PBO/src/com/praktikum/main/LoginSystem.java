package com.praktikum.main;

import com.praktikum.data.Item;
import com.praktikum.users.*;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        // Default data
        userList.add(new Admin("Admin013", "Password013"));
        userList.add(new Mahasiswa("Ismail Dwi Muh. Anugerah", "202410370110013"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Sistem Login ===");

        while (true) {
            System.out.print("Masukkan username/Nama: ");
            String uname = scanner.nextLine();
            System.out.print("Masukkan password/NIM: ");
            String pw = scanner.nextLine();

            User user = authenticate(uname, pw);

            if (user != null) {
                user.menu();
            } else {
                System.out.println("Login gagal. Coba lagi.\n");
            }
        }
    }

    public static User authenticate(String uname, String pw) {
        for (User user : userList) {
            if (user instanceof Admin a) {
                if (a.username.equals(uname) && a.password.equals(pw)) {
                    return a;
                }
            } else if (user instanceof Mahasiswa m) {
                if (m.getName().equalsIgnoreCase(uname) && m.getNim().equals(pw)) {
                    return m;
                }
            }
        }
        return null;
    }
}