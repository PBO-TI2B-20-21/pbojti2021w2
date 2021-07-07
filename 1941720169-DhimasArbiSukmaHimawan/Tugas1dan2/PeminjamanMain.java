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
public class PeminjamanMain {

    public static void main(String[] args) {
        Peminjaman pj = new Peminjaman();

        pj.id = "G101";
        pj.namaMember = "Aldo";
        pj.namaGame = "GTA 5";
        pj.harga = 50000;
        pj.lamaSewa = 5;
        pj.dataPinjam();
    }
}
