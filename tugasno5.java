import java.util.Scanner;

public class tugasno5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Hitung volume
        double volume = Math.pow(sisi, 3);

        // Tampilkan hasil
        System.out.println("Volume Kubus: " + volume);
    }
}
