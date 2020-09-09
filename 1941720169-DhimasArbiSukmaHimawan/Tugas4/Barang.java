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
public class Barang {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }
    public void tampilData(){
        System.out.println("Kode barang     : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga dasar     : Rp"+hargaDasar);
        System.out.printf("Diskon          : %.0f",(diskon*100));
        System.out.print("%\n");
        System.out.println("Harga jual      : Rp"+hitungHargaJual());
    }
}
