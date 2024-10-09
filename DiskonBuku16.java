import java.util.Scanner;

public class DiskonBuku16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jenis buku dan jumlah buku
        System.out.print("Masukkan jenis buku (selain kamus/novel/kamus/novel): ");
        String jenisBuku = input.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt(); {

            double diskon = 0;

        // Proses pengecekan jenis buku dan jumlah untuk menentukan diskon
        if (!jenisBuku.equals("kamus") && !jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        } else if (jenisBuku.equals("kamus")) {
            diskon = 10;  // Diskon 10% untuk buku kamus
            if (jumlahBuku > 2) {
                diskon += 2;  // Tambahan diskon 2% jika lebih dari 2 buku kamus
            }

        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 7 + 2;  // Diskon 7% + 2% jika lebih dari 3 buku novel
            } else {
                diskon = 7;  // Diskon 7% untuk novel
            }
        }

        // Print diskon yang didapat
        System.out.println("Diskon yang didapat: " + diskon + "%");

        // Menutup scanner
        input.close();
    }
}
    
}
