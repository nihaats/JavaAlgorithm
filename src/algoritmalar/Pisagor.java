package algoritmalar;

import java.util.Scanner;

public class Pisagor {
    
    public static void main(String[] args) {
        
        /*  a^2 + b^2 = c^2 ifadesinde a+b+c = 1000 eşitliğini sağlayan
        bir tane özel üçgen vardır. Bu üçgenin bulunmasını sağlayan kod */
        
        Scanner scn = new Scanner(System.in);
        
        int a , b , c = 0;
        int pd = 0; // pisagor değeri == pd
        
        System.out.print("Pisagor değerini girin : ");
        pd = scn.nextInt();
        
        for(a=0 ; a<pd ; a++){
            for(b=1 ; b<pd ; b++){
                 c = pd - (a+b); //c sayısını for kullanmak yerine diğer sayıların toplamından çıkararak bulduk
                 
                 // sayıların bulunması için 3 eşitliğin aynı anda sağlanması söz konusudur:
                 // a sayısı b ve c sayısından küçük olmalı
                 // bize dönecek olan a, b ve c sayılarımızın toplamı pisagor değerimize(pd) eşit olmalı
                 // ve a^2 + b^2 = c^2 eşitliği sağlanmalı
                if((a<b && b<c) && ((a+b+c) == pd) && ((a*a) + (b*b) == (c*c))){
                       
                        System.out.println("a'nın değeri : " + a);
                        System.out.println("b'nin değeri : " + b);
                        System.out.println("c'nin değeri : " + c);
                        break;
                    }
                
            }
           
        }
        
                
    }
   
   
}
