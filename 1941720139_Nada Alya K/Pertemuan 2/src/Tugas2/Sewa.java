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
public class Sewa {

    public int id, harga, total;
    public String namaMember, namaGame;

    public void tampilInformasi() {
        System.out.println("Id Member : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga Sewa : " + harga + " /jam");
    }    
        public int hitungTotal(int waktuSewa){
          int sewa = waktuSewa * harga; 
          return sewa;
    }
}
