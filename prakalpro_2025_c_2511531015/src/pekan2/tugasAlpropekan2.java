package pekan2;

public class tugasAlpropekan2 {
		// public class tugasAlproPekan2 {
	    public static void main(String[] args) {
	        // Deklarasi variabel sesuai tipe data yang diminta
	        int totalRepetisi;      // Total repetisi pull-up
	        float rataRataPerSet;   // Rata-rata repetisi per set (desimal)
	        char tingkatKesulitan;  // Tingkat kesulitan latihan ('E' = Easy, 'M' = Medium, 'H' = Hard)
	        boolean targetTercapai; // Status apakah target repetisi tercapai

	        // Inisialisasi data (contoh data untuk 5 set)
	        int set1 = 8;
	        int set2 = 6;
	        int set3 = 7;
	        int set4 = 5;
	        int set5 = 9;

	        // Menghitung total repetisi
	        totalRepetisi = set1 + set2 + set3 + set4 + set5;

	        // Menghitung rata-rata repetisi per set
	        rataRataPerSet = totalRepetisi / 5.0f; // Gunakan 5.0f agar hasilnya float

	        // Menentukan tingkat kesulitan berdasarkan rata-rata
	        if (rataRataPerSet >= 8.0) {
	            tingkatKesulitan = 'H'; // Hard
	        } else if (rataRataPerSet >= 6.0) {
	            tingkatKesulitan = 'M'; // Medium
	        } else {
	            tingkatKesulitan = 'E'; // Easy
	        }

	        // Menentukan apakah target tercapai (misalnya target minimal 35 repetisi)
	        targetTercapai = totalRepetisi >= 35;

	        // Menampilkan hasil ke layar dengan format rapi
	        System.out.println("=== Statistik Latihan Pull-Up (5 Set) ===");
	        System.out.println("Set 1       : " + set1);
	        System.out.println("Set 2       : " + set2);
	        System.out.println("Set 3       : " + set3);
	        System.out.println("Set 4       : " + set4);
	        System.out.println("Set 5       : " + set5);
	        System.out.println("Total       : " + totalRepetisi);
	        System.out.println("Rata-rata   : " + rataRataPerSet);
	        System.out.println("Tingkat     : " + tingkatKesulitan);
	        System.out.println("Target Capai: " + targetTercapai);

	}

}
