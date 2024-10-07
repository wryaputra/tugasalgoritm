import java.util.Scanner;

public class tugasno4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        // Hitung luas
        double luas = panjang * lebar;

        // Tampilkan hasil
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}
