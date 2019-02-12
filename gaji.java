package sample;

public class gaji {
    private int jumlah;

    public void gajian(int tarif){
        this.jumlah = 30 * tarif;
        System.out.println("Selamat gaji perbulan anda sebesar Rp"+ jumlah);

    }
}
