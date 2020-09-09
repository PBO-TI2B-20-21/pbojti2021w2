package Percobaan1;

/**
 *
 * @author dhimas.arbi
 */
public class Karyawan {
    String id, nama, jenisKelamin, jabatan;
    int gaji;
    
    public void tampilBiodata(){
        System.out.println("ID Karyawan\t: " + id);
        System.out.println("Nama Karyawan\t: " + nama);
        System.out.println("Jenis Kelamin\t: "+jenisKelamin);
        System.out.println("Jabatan\t: "+jabatan);
        System.out.println("Gaji Karyawan\t: "+gaji);
    }
}
