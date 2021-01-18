/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.tangga;
/**
 *
 * @author Intan
 */
public class Tangga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){ //melakukan perulangan kebawah sebanyak 4 kali
            for(int j=1; j<=i; j++){ //melakukan perulangan dengan mengurangi sebanyak 1 dengan jumlah baris sebelumnya
                System.out.print("@"); //output yang ditampilkan
            }System.out.println(); //memberi jarak antar baris
        }
    }   
}
