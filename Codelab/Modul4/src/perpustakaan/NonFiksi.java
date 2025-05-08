package perpustakaan;

public class NonFiksi extends Buku{
    private String bidang;
    public NonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: " + bidang + ")");
    }
}

/*
package perpustakaan;

public class NonFiksi extends Buku{
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setBidang(String bidang) {
        this.tema = bidang;
    }

    public String getBidang() {
        return tema;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + getJudul() + " oleh " + getPenulis() + " (Bidang: " + getBidang() + ")");
    }
}
 */