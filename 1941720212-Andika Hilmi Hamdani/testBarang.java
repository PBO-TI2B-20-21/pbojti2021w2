/**
 * testBarang
 */
public class testBarang {

    public static void main(String[] args) {
        barang brg1 = new  barang();
        brg1.namaBrg = "Pensil";
        brg1.stok = 10;
        brg1.jenisBrg = "ATK";
        brg1.tampilBarang();
        //tampil dengan mengisi stok barang
        System.out.println("Stok Baru Adalah : "+brg1.tambahStok(20));
    }
}