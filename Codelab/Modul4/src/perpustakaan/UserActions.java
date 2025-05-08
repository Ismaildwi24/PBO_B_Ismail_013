package perpustakaan;

import java.util.Scanner;

public class UserActions {
    private Scanner scanner;
    private String[] buku = {
            "1. Madilog oleh Tan Malaka (Bidang: Sejarah dan Ilmu Pengetahuan)",
            "2. Hainuwele: Sang Putri Kelapa oleh Lilis Hu (Genre: Dongeng)",
            "3. Sapiens oleh Yuval Noah Harari (Bidang: Antropologi)",
            "4. Bumi Manusia oleh Pramoedya Ananta Toer (Genre: Cerita Raktat)"
    };

    public UserActions() {
        this.scanner = new Scanner(System.in);
    }

    public void pinjamBuku() {
        System.out.println("\n=== Daftar Buku yang Tersedia ===");
        for (String b : buku) {
            System.out.println(b);
        }

        System.out.print("Pilih nomor buku yang ingin dipinjam: ");
        int pilihan = scanner.nextInt();
        System.out.print("Masukkan durasi peminjaman (dalam hari): ");
        int durasi = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        if (pilihan >= 1 && pilihan <= buku.length) {
            System.out.println("Buku \"" + buku[pilihan - 1] + "\" berhasil dipinjam selama " + durasi + " hari!");
        } else {
            System.out.println("Nomor buku tidak valid! Silakan coba lagi.");
        }
    }

    public void kembalikanBuku() {
        System.out.println("\n=== Daftar Buku yang Dipinjam ===");
        for (String b : buku) {
            System.out.println(b);
        }

        System.out.print("Pilih nomor buku yang ingin dikembalikan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        if (pilihan >= 1 && pilihan <= buku.length) {
            System.out.println("Buku \"" + buku[pilihan - 1] + "\" telah dikembalikan.");
        } else {
            System.out.println("Nomor buku tidak valid! Silakan coba lagi.");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== Sistem Peminjaman Buku ===");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    pinjamBuku();
                    break;
                case 2:
                    kembalikanBuku();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem peminjaman!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}
