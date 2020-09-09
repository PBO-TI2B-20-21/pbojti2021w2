/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author dhimas.arbi
 */
public class Mahasiswa {

    public int nim;
    public String nama, alamat, kelas;
    
    public void tampilBiodata(){
        System.out.println("Nim\t: "+nim);
        System.out.println("Nama\t: "+nama);
        System.out.println("Alamat\t: "+alamat);
        System.out.println("Kelas\t: "+kelas);
    }
}
