import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LocalDateTime tahun = LocalDateTime.now();
        String nama;
        char jenisKelamin;
        int tahunLahir;
        int umur;

        System.out.println();
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = scanner.nextInt();

        umur = tahun.getYear() - tahunLahir;

        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            System.out.println("\nData diri: ");
            System.out.println("Nama         : " + nama);
            System.out.println("Jenis kelamin: Laki-laki");
            System.out.println("Umur         : " + umur + " tahun");
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            System.out.println();
            System.out.println("\nData diri: ");
            System.out.println("Nama         : " + nama);
            System.out.println("Jenis kelamin: Perempuan");
            System.out.println("Umur         : " + umur + " tahun");
        }
        else
            System.out.println("Jenis kelamin tidak diketahui");
    }
}