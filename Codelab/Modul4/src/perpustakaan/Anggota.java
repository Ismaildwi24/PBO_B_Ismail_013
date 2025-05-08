package perpustakaan;

public class Anggota implements Peminjaman{
    public String nama;
    public String idAnggoata;

    public Anggota(String nama, String idAnggoata) {
        this.nama = nama;
        this.idAnggoata = idAnggoata;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul " + judul);
    }

    @Override
    public void pinjamBuku(String judul, int durasiPeminjaman) {
        System.out.println(nama + " meminjam buku berjudul  \"" + judul + "\" selama " + durasiPeminjaman + " hari");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }

    public void displayInfo() {
        System.out.println("Anggota " + nama + " (ID: " + idAnggoata + ")");
    }


}
