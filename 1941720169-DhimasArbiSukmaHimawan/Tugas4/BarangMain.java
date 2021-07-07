/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Dhimas.arbi
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang br = new Barang();
        br.kode = "S1";
        br.namaBarang = "Sabun Mandi";
        br.hargaDasar = 5000;
        br.diskon = 0.15f;
        br.tampilData();
    }
}
