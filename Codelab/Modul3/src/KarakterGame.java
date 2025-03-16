import java.util.Scanner;

public class KarakterGame {
    private String name;
    private int kesehatan = 0;

    public String getName() {
        return name;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public KarakterGame(String name, int kesehatan) {
        this.name = name;
        this.kesehatan = kesehatan;
    }

    void serang(KarakterGame target) {
        int kerusakan = 0;
        String skill;
        Scanner input = new Scanner(System.in);
        String inputSkill;
        String inputPerulangan;

        System.out.println("Pilih sklill " + getName() + " yang akan kamu gunakan: ");
        System.out.println("1. ");
        System.out.println("2. ");
        inputSkill = input.nextLine();
        if (inputSkill.equals("1")) {
            skill = "Fire Sword";
            kerusakan = 0;
            System.out.println(name + " menyerang " + target.getName() + "!");
            target.setKesehatan(target.getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());

        } else if (inputSkill.equals("2")){
            skill = "Water Sword";
            kerusakan = 0;
            System.out.println(name + " menyerang " + target.getName() + "!");
            target.setKesehatan(target.getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }

        System.out.println("Apakah Anda masih ingin bermain?");
        System.out.println("1, Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan Anda: ");
        inputPerulangan = input.nextLine();
    }
}
