package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama pengirim: ");
        String nama = input.nextLine();

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = input.nextInt();

        System.out.print("Jenis layanan (1=Reguler, 2=Express, 3=Same Day): ");
        int layanan = input.nextInt();

        System.out.print("Jenis paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik): ");
        int jenisPaket = input.nextInt();

        // Validasi input sederhana (opsional, nilai plus)
        if (berat <= 0 || jarak <= 0 || layanan < 1 || layanan > 3 || jenisPaket < 1 || jenisPaket > 3) {
            System.out.println("Input tidak valid!");
            return;
        }

        // Hitung biaya dasar dan jarak
        double biayaDasar = berat * 5000;
        double biayaJarak = jarak * 500;
        double subtotal = biayaDasar + biayaJarak;

        // Biaya layanan
        double biayaLayanan = 0;
        String namaLayanan = "";
        if (layanan == 1) {
            namaLayanan = "Reguler";
            biayaLayanan = 0;
        } else if (layanan == 2) {
            namaLayanan = "Express";
            biayaLayanan = subtotal * 0.5;
        } else if (layanan == 3) {
            namaLayanan = "Same Day";
            biayaLayanan = subtotal * 1.0;
        }

        // Biaya jenis paket
        double biayaJenis = 0;
        String namaJenisPaket = "";
        if (jenisPaket == 1) {
            namaJenisPaket = "Dokumen";
            biayaJenis = 2000;
        } else if (jenisPaket == 2) {
            namaJenisPaket = "Barang Biasa";
            biayaJenis = 5000;
        } else if (jenisPaket == 3) {
            namaJenisPaket = "Barang Elektronik";
            biayaJenis = 15000;
        }

        // Total sebelum diskon
        double totalSebelumDiskon = subtotal + biayaLayanan + biayaJenis;

        // Diskon
        double diskon = 0;
        if (totalSebelumDiskon >= 200000) {
            diskon = totalSebelumDiskon * 0.15;
        } else if (totalSebelumDiskon >= 100000) {
            diskon = totalSebelumDiskon * 0.10;
        }

        // Total akhir
        double totalBayar = totalSebelumDiskon - diskon;

        // Output rapi sesuai format
        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim : " + nama);
        System.out.println("Berat Paket   : " + berat + " kg");
        System.out.println("Jarak Pengiriman : " + jarak + " km");
        System.out.println("Jenis Layanan : " + namaLayanan);
        System.out.println("Jenis Paket   : " + namaJenisPaket);
        System.out.println("--------------------------------------");
        System.out.printf("Biaya Dasar   : Rp %.0f%n", biayaDasar);
        System.out.printf("Biaya Jarak   : Rp %.0f%n", biayaJarak);
        System.out.printf("Subtotal      : Rp %.0f%n", subtotal);
        System.out.printf("Biaya Layanan (%s): Rp %.0f%n", 
            (layanan == 1 ? "0%" : layanan == 2 ? "50%" : "100%"), biayaLayanan);
        System.out.printf("Biaya Jenis Paket : Rp %.0f%n", biayaJenis);
        System.out.printf("Total Sebelum Disc. : Rp %.0f%n", totalSebelumDiskon);
        System.out.printf("Diskon        : Rp %.0f%n", diskon);
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL BIAYA   : Rp %.0f%n", totalBayar);
    }
}

	