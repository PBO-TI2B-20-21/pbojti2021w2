/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Nada Alya
 */
public class TestSewa {
    public static void main(String[] args) {
        Sewa sw1 = new Sewa();
        
        sw1.id = 1941720139;
        sw1.namaMember = "Nada Alya";
        sw1.namaGame = "NBA 2020";
        sw1.harga = 5000;
        sw1.tampilInformasi();
        
        System.out.println("Total harga : " + sw1.hitungTotal(4));
    }
}
