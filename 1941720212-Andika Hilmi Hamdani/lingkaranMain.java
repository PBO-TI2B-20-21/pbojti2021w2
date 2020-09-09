/**
 * lingkaranMain
 */
public class lingkaranMain {

    public static void main(String[] args) {
        lingkaran L = new lingkaran();
        L.phi=3.14;
        L.r=7;
        System.out.println("Luas = "+L.hitungLuas());
        System.out.println("Keliling = "+L.hitungKeliling());
    }
}