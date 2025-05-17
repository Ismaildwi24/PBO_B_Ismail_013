package com.praktikum.main;

import com.praktikum.data.Item;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    static ArrayList<User> userList = new ArrayList<>();
    static ArrayList<Item> reportedItems = new ArrayList<>();
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