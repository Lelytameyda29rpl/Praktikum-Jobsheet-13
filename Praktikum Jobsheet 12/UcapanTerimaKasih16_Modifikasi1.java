import java.util.Scanner;

public class UcapanTerimaKasih16_Modifikasi1 {

    public static String PenerimaUcapan() {
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc16.nextLine();
        sc16.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    // Fungsi UcapanTambahan dengan parameter
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        
        // Contoh penggunaan fungsi UcapanTambahan
        String ucapanTambahan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapanTambahan);
    }
}
