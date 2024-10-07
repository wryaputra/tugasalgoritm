import java.util.Scanner;

public class tugasno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Hitung keliling
        double keliling = 2 * Math.PI * jariJari;

        // Tampilkan hasil
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}