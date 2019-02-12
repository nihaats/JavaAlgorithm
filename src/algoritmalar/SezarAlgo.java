package algoritmalar;

import java.util.Scanner;

public class SezarAlgo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i;
        int secim;
        String bosluk = " ";
        char bosluk1 = ' ';
        System.out.print("Bir kelime giriniz : ");
        String kelime = scn.nextLine();

        System.out.print("çift indislerin ötelenme miktarı : ");
        int ciftindis = scn.nextInt();

        System.out.print("tek indislerin ötelenme miktarı : ");
        int tekindis = scn.nextInt();

        for (i = 0; i < kelime.length(); i++) {

            if (kelime.charAt(i) == ' ') {

                System.out.print(kelime.charAt(i));

                i++;
            }

            if (i % 2 == 0) {

                char tut = (char) ((int) kelime.charAt(i) - ciftindis);

                if (tut < 97) {

                    tut += 26;
                }

                if (tut > 122) {

                    tut -= 26;
                }

                if (tut < 97 && tut > 122) {

                    System.out.print(tut);
                }

                System.out.print(tut);
            } else if (i == 1) {

                char tut = (char) ((int) kelime.charAt(i) + tekindis);

                if (tut < 97) {

                    tut += 26;

                }
                if (tut > 122) {

                    tut -= 26;

                }

                if (tut < 97 && tut > 122) {

                    System.out.print(tut);
                } else if (tut > 96 && tut < 123) {
                    System.out.print(tut);

                }

            } else if (i % 2 == 1) {

                char tut = (char) ((int) kelime.charAt(i) + tekindis);

                if (tut < 97) {

                    tut += 26;
                }

                if (tut > 122) {

                    tut -= 26;
                }

                if (tut < 97 && tut > 122) {

                    System.out.print(tut);
                }

                System.out.print(tut);

            }

        }

    }
}
