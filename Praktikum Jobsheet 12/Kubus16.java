import java.util.Scanner;

public class Kubus16 {

    private double sisi; // panjang sisi kubus

    // Konstruktor untuk menginisialisasi panjang sisi kubus
    public Kubus16(double sisi) {
        this.sisi = sisi;
    }

    // Fungsi untuk menghitung volume kubus
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    // Getter untuk mendapatkan panjang sisi kubus
    public double getSisi() {
        return sisi;
    }

    // Setter untuk mengatur panjang sisi kubus
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input panjang sisi dari pengguna
        System.out.print("Masukkan panjang sisi kubus: ");
        double panjangSisi = scanner.nextDouble();

        // Membuat objek KubusNoAbsen dengan panjang sisi yang diinputkan
        Kubus16 kubus = new Kubus16(panjangSisi);

        // Menghitung dan mencetak volume kubus
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        // Menghitung dan mencetak luas permukaan kubus
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        scanner.close();
    }
}
