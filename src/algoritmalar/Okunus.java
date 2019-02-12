package algoritmalar;

import java.util.Scanner;

public class Okunus {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Sayıyı Girin: ");
        int sayi = scn.nextInt();
        
        System.out.println(Okunus(sayi));
        
       
        
        System.exit(0);
    }                 
    
    
    public static String Okunus(int sayi){
        
        String [] OnlarOkunus = {" ","On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};
        String [] BirlerOkunus = {" ","Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        
        int BirlerKalan = sayi % 10;
        int OnlarKalan = sayi /10;
        
        return OnlarOkunus[OnlarKalan] + " " + BirlerOkunus[BirlerKalan];
        
        
            
            
        }
    
}
