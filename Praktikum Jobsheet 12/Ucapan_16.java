import java.util.Scanner;
public class Ucapan_16 {

    public static String PenerimaUcapan() {
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc16.nextLine();
        sc16.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you");
    }
}
