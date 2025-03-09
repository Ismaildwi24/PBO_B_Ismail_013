public class Main {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110013";
        rekening2.nomorRekening = "202410370110000";

        rekening1.namaPemilik = "Ismail";
        rekening2.namaPemilik = "Dito";

        rekening1.saldo = 900000;
        rekening2.saldo = 500000;

        rekening1.tampilkanInfo();
        System.out.println();
        rekening2.tampilkanInfo();

        System.out.println();

        rekening1.setorUang(500000);
        rekening2.setorUang(50000);

        System.out.println();

        rekening1.tarikUang(100000);
        rekening2.tarikUang(1500000);

        System.out.println();

        rekening1.tampilkanInfo();
        System.out.println();
        rekening2.tampilkanInfo();




    }
}
