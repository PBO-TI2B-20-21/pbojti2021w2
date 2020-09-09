/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author dhimas.arbi
 */
public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stock           : "+stok);
    }
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}
