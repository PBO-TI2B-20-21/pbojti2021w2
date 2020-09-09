/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Dhimas.arbi
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.phi = 3.14;
        l.r = 49;
        System.out.println("Luas Lingkaran dengan r "+l.r+" adalah "+l.hitungLuas());
        System.out.println("Keliling Lingkaran dengan r "+l.r+" adalah "+l.hitungKeliling());
    }
}
