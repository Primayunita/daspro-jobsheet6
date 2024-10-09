import java.util.Scanner;

public class BilanganTerbesar16 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama (bil1): ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua (bil2): ");
        double bil2 = input.nextDouble(); BilanganTerbesar16 {
    
            System.out.print("Masukkan bilangan ketiga (bil3): ");
            double bil3 = input.nextDouble();
    
            // Inisialisasi nilai max dengan bil1
            double max = bil1;
    
            // Membandingkan bil2 dengan max
            if (bil2 > max) {
                max = bil2;
            }

             // Membandingkan bil3 dengan max
        if (bil3 > max) {
            max = bil3;
        }

        // Cetak nilai maksimum
        System.out.println("Nilai maksimum adalah: " + max);
        
        // Menutup scanner
        input.close();
    }
}
}
