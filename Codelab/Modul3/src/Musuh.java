import java.util.Scanner;

public class Musuh extends KarakterGame{

    public Musuh(String name, int kesehatan) {
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
        System.out.println("1. Snake Bite, damage: 5");
        System.out.println("2. Dead Poison, damage: 25");
        System.out.println("3. Tail Attack, damage: 10");
        System.out.print("Masukkan skill: ");
        inputSkill = input.nextLine();

        if (inputSkill.equals("1")) {
            skill = "Snake Bite";
            kerusakan = 5;

            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill +"!");
            target.setKesehatan(target.getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());

        } else if(inputSkill.equals("2")) {
            skill = "Dead Poison";
            kerusakan = 25;

            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill +"!");
            target.setKesehatan(target.getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());

        } else if (inputSkill.equals("3")) {
            skill = "Tail Attack";
            kerusakan = 10;

            System.out.println(getName() + " menyerang " + target.getName() + " menggunakan " + skill +"!");
            target.setKesehatan(target.getKesehatan() - kerusakan);
            System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }
}
