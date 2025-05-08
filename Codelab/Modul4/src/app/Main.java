package app;

import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.UserActions;

public class Main {
    public static void main(String[] args) {
        NonFiksi buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Fiksi buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");
        NonFiksi buku3 = new NonFiksi("Sapiens", "Yuval Noah Harari", "Antropologi");
        Fiksi buku4 = new Fiksi("Bumi Manusia", "Pramudya Ananta Toer", "Cerita Rakyat");

        buku1.displayInfo();
        buku2.displayInfo();
        buku3.displayInfo();
        buku4.displayInfo();
        System.out.println();

        UserActions userActions = new UserActions();
        userActions.menu();
        System.out.println();

        Anggota anggota1 = new Anggota("Ismail Dwi Muh. Anugerah", "B013");
        Anggota anggota2 = new Anggota("Spongebob Squarepens", "B999");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri kelapa");
    }
}

/*
package app;

import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        NonFiksi buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Fiksi buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();;
        buku2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Ismail Dwi Muh. Anugerah", "B013");
        Anggota anggota2 = new Anggota("Spongebob Squarepens", "B999");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri kelapa");
    }
}
 */