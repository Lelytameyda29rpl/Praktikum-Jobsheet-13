import java.util.Scanner;
public class Percobaan6_16 {

    //public static void main(String[] args) {
        //Scanner input16 = new Scanner(System.in);

        //int p,l,t,L,vol;

        //System.out.println("Masukkan panjang: ");
        //p = input16.nextInt();
        //System.out.println("Masukkan lebar: ");
        //l = input16.nextInt();
        //System.out.println("Masukkan tinggi:");
        //t = input16.nextInt();

        //L = p*l;
        //System.out.println("Luas Persegi Panjang Adalah "+L);

        //vol = p*l*t;
        //System.out.println("Volume Balok Adalah "+vol);
    //}

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang: ");
        p = input16.nextInt();
        System.out.println("Masukkan lebar: ");
        l = input16.nextInt();
        System.out.println("Masukkan tinggi:");
        t = input16.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang Adalah "+L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok Adalah "+vol);
    }
    
}
