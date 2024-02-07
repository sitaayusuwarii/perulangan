package deretgenapganjil;
import java.util.Scanner;
public class DeretGenapGanjil {

    public static void main(String[] args) {
        // TODO code application logic here
        int menu, batas;
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Menampilkan Deret Bilangan");
        System.out.print("Masukkan batas perulangan : ");
        batas = input.nextInt();
        
        System.out.println("Pilih menu : ");
        System.out.println("Menu 1. Bilangan ganjil");
        System.out.println("Menu 2 : Bilangan genap");
        System.out.println("Pilihanmu : ");
        menu = input.nextInt();
        
        if(menu == 1) {
        System.out.println("Deret bilangan ganjil");
        for (int i = 1; i <= batas; i++){
            if(i%2==1) {
            System.out.println(i);
            }
        }
        } else if(menu==2){
        System.out.println("Deret bilangan genap");
        for (int i = 2; i <= batas; i++) {
            if(i%2==0) {
            System.out.println(i);
        }
        }
        } else {
            System.out.println("Masukkan menu yang benar!");
        }
        }
    }

