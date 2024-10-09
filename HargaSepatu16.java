import java.util.Scanner;

public class HargaSepatu16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input merk sepatu
        System.out.print("Masukkan merk sepatu (Converse/Skecher/Nike): ");
        String merk = input.nextLine().toLowerCase();

        // Input kategori ukuran
        System.out.print("Masukkan kategori ukuran: ");
        String kategori = input.nextLine().toLowerCase(); {
    
            int harga = 0;

        // Proses pengecekan merk dan kategori untuk menentukan harga
        if (merk.equals("converse")) {
            if (kategori.equals("slip on")) {
                harga = 800000;  // Slip On 36-40
            } else if (kategori.equals("high top")) {
                harga = 1200000;  // High Top 40-44
            }
        } else if (merk.equals("skecher")) {
            if (kategori.equals("woman")) {
                harga = 1000000;  // Woman 36-41
            } else if (kategori.equals("man")) {
                harga = 1800000;  // Man 41-44
            }
        } else if (merk.equals("nike")) {
            if (kategori.equals("kids")) {
                harga = 750000;  // Kids 36-40
            } else if (kategori.equals("adult")) {
                harga = 1500000;  // Adult 40-44
            }
        }

        // Output harga sepatu
        if (harga != 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Merk atau kategori tidak valid.");
        }
        
         // Menutup scanner
         input.close();
        }
    }
}
