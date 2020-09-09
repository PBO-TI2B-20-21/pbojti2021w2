public class barang {
    public String namaBrg,jenisBrg;
    public int stok;

    public void tampilBarang(){
        System.out.println("Nama  Barang : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok         : "+ stok);   
    }
    //method dengan return
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}
