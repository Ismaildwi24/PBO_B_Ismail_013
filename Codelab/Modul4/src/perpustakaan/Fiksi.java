package perpustakaan;

public class Fiksi extends Buku{
    private String genre;
    public Fiksi(String judul, String penulis, String genre) {
       super(judul, penulis);
       this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: " +judul + " oleh " + penulis + " (Genre: " + genre + ")");
    }
}

/*
package perpustakaan;

public class Fiksi extends Buku{
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

    public void setGenre(String genre) {
        this.tema = genre;
    }

    public String getGenre() {
        return tema;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: " + getJudul() + " oleh " + getPenulis() + " (Genre: " + getGenre() + ")");
    }
}
 */
