package Percobaan1;

/**
 *
 * @author dhimas.arbi
 */
public class Main {
    public static void main(String[] args) {
        Karyawan k = new Karyawan();
        k.id = "k01";
        k.nama = "Adi";
        k.jenisKelamin = "Laki-laki";
        k.jabatan = "Manager Keuangan";
        k.gaji = 5000000;
        k.tampilBiodata();
    }
}
