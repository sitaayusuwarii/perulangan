
package uangsaku;
import java.util.Scanner;
public class UangSaku {

    public static void main(String[] args) {
        
        
          Scanner input = new Scanner(System.in);
        int jumlah;
        double jumlahBelanja;
        
        System.out.print("Masukkan jumlah anak yang akan berbelanja : ");
        jumlah = input.nextInt();
        
        for(int i = 1; i <= jumlah; i++) {
            System.out.println("====Anak ke-" + i + "====");
            
            System.out.print("Apakah anak ini ingin berbelanja? (Ya/Tidak): ");
            String jawab = input.next();
            
            if(jawab.equalsIgnoreCase("Ya")) {
                System.out.print("Masukkan jumlah uang saku anak ke-" + i + " : Rp");
                double uangSaku = input.nextDouble();
                
                System.out.print("Masukkan jumlah uang yang akan dibelanjakan anak ke-" + i + " : Rp");
                jumlahBelanja = input.nextDouble();
                
                if (uangSaku >= jumlahBelanja) {
                    uangSaku -= jumlahBelanja;
                    System.out.println("Belanja berhasil");
                } else  {
                    System.out.println("Maaf, uang tidak mencukupi untuk belanja");
                    System.out.println("Anak ke-" + i + "Tidak jadi belanja");
                }
                        
                System.out.println("Sisa uang saku anak ke-" + i + " : Rp" + uangSaku);
            } 
            }
        }
    }

        
    
    
