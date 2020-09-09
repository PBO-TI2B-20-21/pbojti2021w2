/**
 * BarangTugasMain
 */
public class BarangTugasMain {

    public static void main(String[] args) {
        BarangTugas brg = new BarangTugas();
        
        brg.kode="666";
        brg.namaBarang="T-shirt";
        brg.hargaDasar=200000;
        brg.diskon=0.1f;
        brg.hitungHargaJual(brg.hargaDasar, brg.diskon);
        brg.tampilData();
    }
}