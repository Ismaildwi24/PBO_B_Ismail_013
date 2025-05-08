package com.praktikum.users;

import java.util.Scanner;

public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public abstract void login(User user);

    public abstract void displayAppMenu();

    public void displayInfo(User user) {
        System.out.println("Login berhasil!");
        System.out.println("Informasi com.praktikum.users.Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM: " + user.getNim());
    }
}

/*
package com.praktikum.users;

import java.util.Scanner;

public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login(User user){
        Scanner input = new Scanner(System.in);
        user.setNama(nama = input.nextLine());
        System.out.println("Masukkan Username: ");
        user.setNim(nim = input.nextLine());
        System.out.println("Masukkan Password: ");
    }

    public void displayInfo(User user) {
        System.out.println("Login berhasil!");
        System.out.println("Informasi com.praktikum.users.Mahasiswa yang Login: ");
        System.out.println("Nama: " + user.getNama());
        System.out.println("NIM: " + user.getNim());
    }
}
 */