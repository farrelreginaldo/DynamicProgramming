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
public class uangpec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner a = new Scanner(System.in);
              System.out.print("Masukkan uang yang akan dipecah : Rp");
        int uang = a.nextInt();
        int pecahan [] = new int[] {5000,2000,1000,500};
        int jumlah;
        for (int i = 0; i < pecahan.length; i ++) {
            jumlah = uang / pecahan[i];
            uang = uang% pecahan [i];
           
            System.out.println("Pecahan" + pecahan[i] + "sebanyak"+ jumlah + "keping");
        }
    }
}
