import java.lang.annotation.Target;
import java.util.Scanner;

public class Pahlawan extends KarakterGame{

    public Pahlawan(String name, int kesehatan) {
        super(name, kesehatan);
    }

    @Override
    void serang(KarakterGame target) {
        int kerusakan = 0;
        String skill;
        Scanner input = new Scanner(System.in);
        String inputSkill;
        String inputPerulangan;

        System.out.println("Pilih sklill " + getName() + " yang akan kamu gunakan: ");
        System.out.println("1. Orbital Strike, damage: 10");
        System.out.println("2. Verikal Kick, damage: 10");
        System.out.println("3. Rock Fall, damage: 25");
        System.out.print("Masukkan skill: ");
        inputSkill = input.nextLine();

        if (inputSkill.equals("1")) {
            skill = "Orbital Strike";
            kerusakan = 10;
            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill + "!");
            target.setKesehatan(getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());

        } else if (inputSkill.equals("2")){
            skill = "Vertikal Kick";
            kerusakan = 10;
            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill + "!");
            target.setKesehatan(getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());

        } else if (inputSkill.equals("3")) {
            skill = "Rock Fall";
            kerusakan = 25;
            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill + "!");
            target.setKesehatan(getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }


    }
}
