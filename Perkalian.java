
package perkalian;
import java.util.Scanner;

public class Perkalian {
    public static void perkalian (int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Masukkan panjang angka : ");
                int n = input.nextInt();
                perkalian(n);
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.print("Input harus berupa bilangan bulat.");
                input.next();
            }
        }
    }
 
    }
    

