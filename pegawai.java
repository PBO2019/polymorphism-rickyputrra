package sample;

public class pegawai {
    protected int tarif;

    public static void main (String[]args){
        staff staff = new staff();
        supervisor supervisor = new supervisor();
        gaji gajian = new gaji();

        gajian.gajian(supervisor.tarif);
        gajian.gajian(staff.tarif);
    }
}
