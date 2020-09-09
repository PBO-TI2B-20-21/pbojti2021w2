/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Nada Alya
 */
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lr1 = new Lingkaran();
        
        lr1.r = 7;
        System.out.println("Luas\t: " + lr1.hitungLuas());
        System.out.println("Keliling\t: " + lr1.hitungKeliling());
    }
}
