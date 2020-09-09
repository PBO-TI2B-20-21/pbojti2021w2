/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1dan2;

/**
 *
 * @author Dhimas.arbi
 */
public class Peminjaman {

    public String id, namaMember, namaGame;
    public int harga, lamaSewa;

    public void dataPinjam() {
        System.out.println("ID member   : " + id);
        System.out.println("Nama member : " + namaMember);
        System.out.println("Nama game   : " + namaGame);
        System.out.println("harga 	: "+ harga);
        System.out.println("Lama Sewa   : "+ lamaSewa);
        System.out.println("harga sewa  : "+ hargaPinjam());
    }

    public int hargaPinjam() {
        return lamaSewa * harga;
    }
}
