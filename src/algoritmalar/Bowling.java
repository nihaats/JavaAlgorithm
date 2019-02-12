/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmalar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nihaa
 */
public class Bowling {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int lobut = 10;
        int frame = 1;
        int atis = 0, atis2 = 0;
        int[] framepuan = new int[10];
        int strike = 10;
        String[] oyuncu = new String[10];

        System.out.print("Oyuncu sayısını giriniz : ");
        int oyuncugirisi = scn.nextInt();

        for (int i = 0; i < oyuncugirisi; i++) {

            System.out.print((i + 1) + ". oyuncu adı : ");
            oyuncu[i] = scn.next();

        }

        while (frame <= 10) {
            System.out.println(" ");
            System.out.println("*************** " + frame + ". FRAME ***************");
            System.out.println("----------------------------------------");
            for (int j = 0; j < oyuncugirisi; j++) {
                for (int k = 0; k < 1; k++) {

                    System.out.println("-----> " + oyuncu[j] + " " + (k + 1) + ". ATIŞ <-----");

                    System.out.print("1. atış için bir sayı tahmin ediniz (0-9) : ");
                    int tahmin = scn.nextInt();
                    if (tahmin < 0 || tahmin > 10) {

                        System.out.println("Lütfen 0 ile 9 arasında bir sayı giriniz.");
                        return;
                    }
                    int pcrandom = rnd.nextInt(10);
                    // System.out.println("Bilgisayar randomu : " + pcrandom);

                    if ((tahmin - 1 == pcrandom) || (tahmin + 1 == pcrandom)) {

                        System.out.println(lobut - 1 + " lobut devirdiniz");
                        atis = lobut - 1;
                        System.out.println(" ");
                    } else if ((tahmin - 2 == pcrandom) || (tahmin + 2 == pcrandom)) {
                        System.out.println(lobut - 2 + " lobut devirdiniz");
                        atis = lobut - 2;
                        System.out.println(" ");
                    } else if ((tahmin - 3 == pcrandom) || (tahmin + 3 == pcrandom)) {
                        System.out.println(lobut - 3 + " lobut devirdiniz");
                        atis = lobut - 3;
                        System.out.println(" ");
                    } else if ((tahmin - 4 == pcrandom) || (tahmin + 4 == pcrandom)) {
                        System.out.println(lobut - 4 + " lobut devirdiniz");
                        atis = lobut - 4;
                        System.out.println(" ");
                    } else if ((tahmin - 5 == pcrandom) || (tahmin + 5 == pcrandom)) {
                        System.out.println(lobut - 5 + " lobut devirdiniz");
                        atis = lobut - 5;
                        System.out.println(" ");
                    } else if ((tahmin - 6 == pcrandom) || (tahmin + 6 == pcrandom)) {
                        System.out.println(lobut - 6 + " lobut devirdiniz");
                        atis = lobut - 6;
                        System.out.println(" ");
                    } else if ((tahmin - 7 == pcrandom) || (tahmin + 7 == pcrandom)) {
                        System.out.println(lobut - 7 + " lobut devirdiniz");
                        atis = lobut - 7;
                        System.out.println(" ");
                    } else if ((tahmin - 8 == pcrandom) || (tahmin + 8 == pcrandom)) {
                        System.out.println(lobut - 8 + " lobut devirdiniz");
                        atis = lobut - 8;
                        System.out.println(" ");
                    } else if ((tahmin - 9 == pcrandom) || (tahmin + 9 == pcrandom)) {
                        System.out.println(lobut - 9 + " lobut devirdiniz");
                        atis = lobut - 9;
                        System.out.println(" ");
                    } else if (tahmin == pcrandom) {

                        System.out.println("strike");
                        atis = lobut;
                        atis2 = 0;
                    }

                    if (lobut - atis != 0) {
                        System.out.println("-----> " + oyuncu[j] + " " + (k + 2) + ". ATIŞ <-----");

                        System.out.print("2. atış için bir sayı tahmin ediniz (0-" + ((lobut - atis) - 1) + ") : ");
                        int tahmin2 = scn.nextInt();
                        if (tahmin2 < 0 || tahmin2 > ((lobut - atis) - 1)) {
                            System.out.println("tahmininiz bu aralıkta deðil");
                            atis2 = 0;
                            break;
                        }

                        int pcrandom2 = rnd.nextInt(lobut - atis);
                        //  System.out.println("Bilgisayar random : " + pcrandom2);

                        if ((tahmin2 - pcrandom2) == 0) {
                            System.out.println("spare");
                            atis2 = 10 - atis;
                        } else if ((tahmin2 - pcrandom2 == 1) || (tahmin2 - pcrandom2 == -1)) {
                            System.out.println(((lobut - atis) - 1) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 1);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 2) || (tahmin2 - pcrandom2 == -2)) {
                            System.out.println(((lobut - atis) - 2) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 2);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 3) || (tahmin2 - pcrandom2 == -3)) {
                            System.out.println(((lobut - atis) - 3) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 3);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 4) || (tahmin2 - pcrandom2 == -4)) {
                            System.out.println(((lobut - atis) - 4) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 4);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 5) || (tahmin2 - pcrandom2 == -5)) {
                            System.out.println(((lobut - atis) - 5) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 5);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 6) || (tahmin2 - pcrandom2 == -6)) {
                            System.out.println(((lobut - atis) - 6) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 6);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 7) || (tahmin2 - pcrandom2 == -7)) {
                            System.out.println(((lobut - atis) - 7) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 7);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 8) || (tahmin2 - pcrandom2 == -8)) {
                            System.out.println(((lobut - atis) - 8) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 8);
                            System.out.println(" ");
                        } else if ((tahmin2 - pcrandom2 == 9) || (tahmin2 - pcrandom2 == -9)) {
                            System.out.println(((lobut - atis) - 9) + " lobut devirdiniz");
                            atis2 = ((lobut - atis) - 9);
                            System.out.println(" ");
                        }
                    }

                }

                for (int a = 0; a < oyuncugirisi; a++) {

                    if (j == a) {
                        framepuan[a] = atis + atis2;

                    }
                }

            }
            System.out.println(" ");
            System.out.println("Frame sonu puanları : ");
            for (int h = 0; h < oyuncugirisi; h++) {
                System.out.print(oyuncu[h] + " puanı : " + framepuan[h]);
                System.out.println("  ");
                System.out.println("  ");

            }
            frame++;
        }

    }

}
