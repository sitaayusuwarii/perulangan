
package biji;
import java.util.Scanner;
public class Biji {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hari : ");
        int jumlahHari = input.nextInt();
        
        int panjangAwal = 0;
        for (int i = 1; i<=jumlahHari; i++) {
            if(i % 2!= 0) {
                panjangAwal += 5;
            }
        }
            System.out.println("Panjang tanaman setelah "+jumlahHari+ "Hari : "+panjangAwal+" cm");
        }
    }
    
