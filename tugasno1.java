import java.util.Scanner;

public class tugasno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga telur per kilo
        final double HARGA_TELUR_PER_KILO = 28000;

        // Input jumlah telur (kg)
        System.out.print("Jumlah Telur (kg): ");
        double jumlahTelur = scanner.nextDouble();

        // Hitung total bayar
        double totalBayar = jumlahTelur * HARGA_TELUR_PER_KILO;

        // Input uang yang diberikan
        System.out.print("Uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();

        // Hitung uang kembalian
        double uangKembalian = uangDiberikan - totalBayar;

        // Tampilkan hasil
        System.out.printf("Total Bayar: %.2f\n", totalBayar);
        System.out.printf("Uang Kembalian: %.2f\n", uangKembalian);
        
        scanner.close();
    }
}
