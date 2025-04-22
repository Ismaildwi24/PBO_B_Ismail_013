import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputPerulangan;
        Scanner input = new Scanner(System.in);
        KarakterGame karakterGame1 = new KarakterGame("Karakter Umum", 100);
        KarakterGame karakterGame2 = new Pahlawan("Brimstone", 150);
        KarakterGame karakterGame3 = new Musuh("Viper", 200);

        System.out.println("Battle Brimstone vs Viper Dimulai!");
        System.out.println("Status awal: ");
        System.out.println(karakterGame2.getName() + " memiliki kesehatan: " + karakterGame2.getKesehatan());
        System.out.println(karakterGame3.getName() + " memiliki kesehatan: " + karakterGame3.getKesehatan());

        System.out.println();

        do {
            karakterGame2.serang(karakterGame3);
            System.out.println();
            karakterGame3.serang(karakterGame2);
            System.out.println();
        } while (karakterGame2.getKesehatan() > 0 && karakterGame3.getKesehatan() > 0);

        if (karakterGame2.getKesehatan() == 0)
            System.out.println(karakterGame2.getName() + " kalah, " + "Kesehatan " + karakterGame2.getName() + ": " + karakterGame2.getKesehatan());
        else if (karakterGame3.getKesehatan() == 0)
            System.out.println(karakterGame3.getName() + " kalah, " + "Kesehatan " + karakterGame3.getName() + ": " + karakterGame3.getKesehatan());

        System.out.println();

        do {
            System.out.println("Apakah Anda masih ingin bermain?");
            System.out.println("1, Ya");
            System.out.println("2. Tidak");
            System.out.print("Masukkan pilihan Anda: ");
            inputPerulangan = input.nextLine();

            if (inputPerulangan.equals("1")) {
                karakterGame2.setKesehatan(100);
                karakterGame3.setKesehatan(100);

                System.out.println();

                System.out.println("Battle Brimstone vs Viper Dimulai!");
                System.out.println("Status awal: ");
                System.out.println(karakterGame2.getName() + " memiliki kesehatan: " + karakterGame2.getKesehatan());
                System.out.println(karakterGame3.getName() + " memiliki kesehatan: " + karakterGame3.getKesehatan());

                System.out.println();

                do {
                    karakterGame2.serang(karakterGame2);
                    System.out.println();
                    karakterGame3.serang(karakterGame1);
                    System.out.println();
                } while (karakterGame2.getKesehatan() > 0 || karakterGame3.getKesehatan() > 0);

                if (karakterGame2.getKesehatan() == 0)
                    System.out.println(karakterGame1.getName() + " kalah, " + "Kesehatan " + karakterGame2.getName() + ": " + karakterGame2.getKesehatan());
                else if (karakterGame3.getKesehatan() == 0)
                    System.out.println(karakterGame3.getName() + " kalah, " + "Kesehatan " + karakterGame3.getName() + ": " + karakterGame3.getKesehatan());

                System.out.println("Battle berhenti");

            } else if (inputPerulangan.equals("2"))
                System.out.println("Battle berhenti!");

            continue;
        } while (inputPerulangan.equals("1"));
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputPerulangan;
        Scanner input = new Scanner(System.in);
        KarakterGame karakterGame1 = new Pahlawan("Brimstone", 100);
        KarakterGame karakterGame2 = new Musuh("Viper", 100);

        System.out.println("Battle Brimstone vs Viper Dimulai!");
        System.out.println("Status awal: ");
        System.out.println(karakterGame1.getName() + " memiliki kesehatan: " + karakterGame1.getKesehatan());
        System.out.println(karakterGame2.getName() + " memiliki kesehatan: " + karakterGame2.getKesehatan());

        System.out.println();

        do {
            karakterGame1.serang(karakterGame2);
            System.out.println();
            karakterGame2.serang(karakterGame1);
            System.out.println();
        } while (karakterGame1.getKesehatan() > 0 || karakterGame2.getKesehatan() > 0);

        if (karakterGame1.getKesehatan() == 0)
            System.out.println(karakterGame1.getName() + " kalah, " + "Kesehatan " + karakterGame1.getName() + ": " + karakterGame1.getKesehatan());
        else if (karakterGame2.getKesehatan() == 0)
            System.out.println(karakterGame2.getName() + " kalah, " + "Kesehatan " + karakterGame2.getName() + ": " + karakterGame2.getKesehatan());

        System.out.println();

        System.out.println("Apakah Anda masih ingin bermain?");
        System.out.println("1, Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan Anda: ");
        inputPerulangan = input.nextLine();
        System.out.println();

        if (inputPerulangan.equals("1")) {
            karakterGame1.setKesehatan(100);
            karakterGame2.setKesehatan(100);

            System.out.println("Battle Brimstone vs Viper Dimulai!");
            System.out.println("Status awal: ");
            System.out.println(karakterGame1.getName() + " memiliki kesehatan: " + karakterGame1.getKesehatan());
            System.out.println(karakterGame2.getName() + " memiliki kesehatan: " + karakterGame2.getKesehatan());

            System.out.println();

            do {
                karakterGame1.serang(karakterGame2);
                System.out.println();
                karakterGame2.serang(karakterGame1);
                System.out.println();
            } while (karakterGame1.getKesehatan() > 0 || karakterGame2.getKesehatan() > 0);

            if (karakterGame1.getKesehatan() == 0)
                System.out.println(karakterGame1.getName() + " kalah, " + "Kesehatan " + karakterGame1.getName() + ": " + karakterGame1.getKesehatan());
            else if (karakterGame2.getKesehatan() == 0)
                System.out.println(karakterGame2.getName() + " kalah, " + "Kesehatan " + karakterGame2.getName() + ": " + karakterGame2.getKesehatan());

            System.out.println("Battle berhenti");

        } else if (inputPerulangan.equals("2"))
            System.out.println("Battle berhenti!");

    }
}
*/