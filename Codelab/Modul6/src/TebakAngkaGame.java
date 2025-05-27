import java.util.Random;

public class TebakAngkaGame {
    private int angkaRahasia;
    private int jumlahPercobaan;

    public TebakAngkaGame() {
        generateAngkaBaru();
    }

    public void generateAngkaBaru() {
        Random rand = new Random();
        angkaRahasia = rand.nextInt(100) + 1;
        jumlahPercobaan = 0;
    }

    public String tebak(int tebakan) {
        jumlahPercobaan++;
        if (tebakan < angkaRahasia) {
            return "Terlalu kecil!";
        } else if (tebakan > angkaRahasia) {
            return "Terlalu besar!";
        } else {
            return "Tebakan benar!";
        }
    }

    public int getJumlahPercobaan() {
        return jumlahPercobaan;
    }
}