/**
 * sewa
 */
public class sewa {

    public String id, nama, judulBuku;
    public int harga;
    
    public int hitungHarga(int lamaSewa, int harga){
        this.harga = lamaSewa*harga;
        return this.harga;
    }
    
    public void cetak(){
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("Judul Buku : "+judulBuku);
        System.out.println("Harga total : "+harga);
    }
}