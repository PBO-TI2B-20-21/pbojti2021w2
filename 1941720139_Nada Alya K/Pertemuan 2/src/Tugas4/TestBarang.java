/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Nada Alya
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        
        br1.kode = "PY1";
        br1.namaBarang = "Payung";
        br1.hargaDasar = 10000;
        br1.diskon = 5;
        br1.tampilData();
        
        System.out.println();
        Barang br2 = new Barang();
        
        br2.kode = "HP1";
        br2.namaBarang = "Handphone";
        br2.hargaDasar = 2000000;
        br2.diskon = 15;
        br2.tampilData();
    }
}
