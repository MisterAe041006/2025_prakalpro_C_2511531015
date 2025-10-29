package pekan3;
import java.util.Scanner;
public class menghitungupahmingguankaryawan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        String golongan = input.nextLine().toUpperCase();

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        // Menentukan upah per jam
        int upahPerJam = 0;
        if (golongan.equals("A")) {
            upahPerJam = 1000;
        } else if (golongan.equals("B")) {
            upahPerJam = 2000;
        } else if (golongan.equals("C")) {
            upahPerJam = 3000;
        } else if (golongan.equals("D")) {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid! Upah per jam dianggap 0.");
        }

        // Hitung upah normal
        int upahNormal = upahPerJam * jamKerja;

        // Hitung lembur
        int lembur = 0;
        if (jamKerja > 60) {
            lembur = (jamKerja - 60) * 5000;
        }

        // Total upah
        int totalUpah = upahNormal + lembur;

        // Output
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Upah mingguan: " + totalUpah);
	}

}
