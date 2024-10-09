import java.util.Scanner;
public class Pemilihan2Percobaan216 {

    public static void main (String[] args){
        Scanner scanner16 = new Scanner(System.in);
        String menu,member;
        boolean Member;
        int jumlahBeli,PilihanMenu;
        double totalBayar, harga = 0, diskon = 0;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        PilihanMenu = scanner16.nextInt();
        scanner16.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = scanner16.nextLine();
        System.out.println("-------------------------------------");
    
    if (member.equals("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (PilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (PilihanMenu== 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else if (PilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        totalBayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + totalBayar);
    }
    else if (member.equals("n")) {
        if (PilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (PilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else if (PilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        System.out.println("Total bayar = " + harga);

    }else {
        System.out.println("Member tidak valid");
    }
    System.out.println("-----------------------------");
}
}
