
package barangbelanjaan;
import java.util.Scanner;
public class BarangBelanjaan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = input.nextInt();
        
        //variabel total pembayaran
        double totalPembayaran = 0;
        
        for (int i = 1; i<= jumlahBarang; i++) {
            System.out.println("=== Barang ke-" + i + " ===");

            // Input nama barang
            System.out.print("Masukkan nama barang: ");
            String namaBarang = input.next();

            // Input harga barang
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = input.nextDouble();

            // Menampilkan informasi barang
            System.out.println("Barang: " + namaBarang);
            System.out.println("Harga: " + hargaBarang);

            // Menambahkan harga barang ke total pembayaran
            totalPembayaran += hargaBarang;

            System.out.println(); // Memberikan spasi antar barang
        }
        // Output total pembayaran
        System.out.println("Total yang harus dibayar: " + totalPembayaran);
    }
}


