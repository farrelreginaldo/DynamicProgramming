/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Scanner;

/**
 *
 * @author Farrel
 */
public class mobil {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.print("Nama : ");
        String nama = id.next();
        Scanner isr = new Scanner(System.in);
        System.out.print("Jumlah berat barang {kg}: ");
        int uang = isr.nextInt();
        int berat [] = {7, 5, 4, 3, 2};
      String nam[] = {"E","B","A","D","C"}; 
        int upah [] = {10000, 7000, 5000, 3000, 2000};
        int jumlah;
        
        for(int i = 0; i<berat.length;i++){
            jumlah = uang/berat[i];
            int banyak = jumlah*berat[i];
            uang =uang%berat[i];
            int harga = jumlah*upah[i];
            System.out.println("barang " + nam[i] + " sejumlah "+ jumlah +
                    " buah dengan total berat "+banyak + "kg. Upah yang didapat sebesar "+harga);
        }
    }
}