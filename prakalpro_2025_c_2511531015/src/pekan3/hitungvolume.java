package pekan3;
import java.util.Scanner;
public class hitungvolume {

	public static void main(String[] args) {
		// Inisialisasi
        Scanner input = new Scanner(System.in);
        double r, t, volume;
        final double PI = 3.14;

        // Input dari pengguna
        System.out.print("Masukkan jari-jari tabung: ");
        r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        t = input.nextDouble();

        // Menghitung volume tabung
        volume = PI * r * r * t;

        // Menampilkan hasil
        System.out.println("Volume tabung = " + volume);

	}

}
