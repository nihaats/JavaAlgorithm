package algoritmalar;

import java.util.Scanner;

public class TabanDonustur {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {

            System.out.print("Sayı değerini giriniz : ");
            int sayi = scn.nextInt();

            System.out.print("Taban değerini giriniz (2-5) : ");
            int taban = scn.nextInt();

            if (sayi < taban) {
                System.out.println("Lütfen yeniden giriniz.");
                break;
            }

            Taban_donustur(sayi, taban);

        }
    }

    public static void Taban_donustur(int gelen, int taban) {
        int[] dizi = null;
        int degis = gelen;
        int sayac = 1;
        while (degis > taban) {

            sayac++;
            degis = degis / taban;

        }

        dizi = new int[sayac];

        for (int i = 0; i < dizi.length; i++) {

            int sayi = gelen % taban;
            dizi[i] = sayi;
            gelen = gelen / taban;
            if (gelen < taban) {

                dizi[dizi.length - 1] = gelen;
                break;
            }

        }

        if (dizi.length % 2 == 0) {

            for (int i = 0; i < dizi.length / 2; i++) {

                int tut = dizi[i];
                dizi[i] = dizi[dizi.length - (i + 1)];
                dizi[dizi.length - (i + 1)] = tut;

            }

        }

        if (dizi.length % 2 == 1) {

            for (int i = 0; i < dizi.length / 2; i++) {

                int tut = dizi[i];
                dizi[i] = dizi[dizi.length - (i + 1)];
                dizi[dizi.length - (i + 1)] = tut;

                dizi[dizi.length / 2] = dizi[dizi.length / 2];

            }

        }

        for (int i = 0; i < dizi.length; i++) {

            System.out.print(dizi[i]);

        }

        System.exit(0);

    }
}
