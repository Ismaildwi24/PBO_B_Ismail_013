/*
Di bawah ini terdapat dua import API, yang pertama adalah java.time.LocalDateTime
digunakan untuk menentukan umur user. Nantinya tahun kelahiran user akan
dikurangi dengan tahun saat ini yang didapatkan dari API java.time.LocalDateTime.
API yang kedua adalah java.util.scanner digunakan untuk menerima input dari user
seperti nama, jenis kelamin, dan tahun lahir
 */
import java.time.LocalDateTime;
import java.util.Scanner;

//Di bawah ini saya mendeklarasikan kelas Main
public class Main{
    // Di bawah ini saya mendeklarasikan fungsi main
    public static void main(String[] args){

        LocalDateTime tahun = LocalDateTime.now();//Di samping ini merupakan API pertama
        Scanner scanner = new Scanner(System.in);//Di samping ini merupakan API kedua
        String nama;//Di samping ini saya mendeklarasikan variabel nama bertipe data String untuk menyimpan input-an nama user
        char jenisKelamin;//Di samping ini saya mendeklarasikan variabel jenisKelamin bertipe data char untuk menyimpan input-an jenis kelamin user
        int tahunLahir;//Di samping ini saya mendeklarasikan variabel tahunLahir bertipe data int untuk menyimpan input-an tahun lahir user
        int umur;//Di samping ini saya mendeklarasikan variabel umur untuk menyimpan hasil operasi penghitungan berupa umur user
        /* Perlu diperhatikan di atas terdapat dua variabel yang saya deklarasikan menggunakan dua kata di mana pada pengetikan kata pertama saya awali dengan huruf kecil sedangkan kata kedua
        saya awali dengan huruf kapital, ini sesuai dengan syntax apabila ingin mendeklarasikan suatu variabel yang terdiri dua kata pada program java. */
        System.out.print("\nMasukkan nama: ");//Di samping ini saya menginisiasikan sebuah string untuk meminta input-an dari user
        nama = scanner.nextLine();//Di samping ini terdapat satu method yang saya gunakan untuk menyimpan input-an ke variabel nama

        System.out.print("Masukkan jenis kelamin (P/L): ");//Di samping ini saya menginisiasikan sebuah string untuk meminta inputan dari user
        jenisKelamin = scanner.next().charAt(0);// Di samping ini terdapat satu method yang saya gunakan untuk menyimpan input-an ke variabel jenisKelamin
        //Di atas ini saya menggunakan .charAt(0) yang berguna untuk meng-casting atau mengubah tipe data string ke char sehingga inputan user dapat diproses
        System.out.print("Masukkan tahun lahir: ");//Di samping ini saya menginisiasikan sebuah string untuk meminta input-an dari user
        tahunLahir = scanner.nextInt();//Di samping ini terdapat satu method yang syaa gunakan untuk menyimpan input-an ke variabel tahunLahir

        umur = tahun.getYear() - tahunLahir;//Di samping ini saya menginisiasikan operasi matematika berupa pengurangan untuk mendapatkan umur user

        if (jenisKelamin == 'L' || jenisKelamin == 'l') {//Disini saya menggunakan percabangan if/else/if untuk menentukan output program berdasarakan input-an jenisKelamin user
            System.out.println("\nData diri: ");//Di sini program akan mencetak output sesuai dengan input-an user
            System.out.println("Nama         : " + nama);
            System.out.println("Jenis kelamin: Laki-laki");//Pada kondisi ini program akan mencetak "Jenis kelamin: Laki-laki karena user meng-input huruf 'L' atau 'l'
            System.out.println("Umur         : " + umur + " tahun");
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            System.out.println();
            System.out.println("\nData diri: ");
            System.out.println("Nama         : " + nama);
            System.out.println("Jenis kelamin: Perempuan");//Pada kondisi ini program akan mencetak "Jenis kelamin: Perempuan" karena user meng-input huruf 'P' atau 'p'
            System.out.println("Umur         : " + umur + " tahun");
        } else {
            do {// Di sini saya menggunakan do-while loop (Perulangan) untuk mengulang program apabila user meng-input huruf yang tidak sesuai dengan ketentuan
                System.out.println("\n\nMaaf jenis kelamin Anda tidak terdeteksi. Mohon isi kembali data diri Anda!");//Di samping ini saya menginisiasikan string untuk mengarahkan user meng-input kembali data diri

                scanner.nextLine();//Saya menambahkan method ini untuk mengatasi permasalahan program yaitu program melewatkan perintah peng-input-an variabel nama karena adanya newline pada buffer

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
            } while (jenisKelamin != 'P' && jenisKelamin != 'p' && jenisKelamin != 'L' && jenisKelamin != 'l');//Ini merupakan kondisi yang akan membuat looping terus berjalan
        }

    }

}