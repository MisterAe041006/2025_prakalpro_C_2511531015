package pekan7_2511531015;
import java.util.Scanner;
public class tugasAlproPekan7_2511531015 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Akun akun = new Akun();

        System.out.println("===== REGISTRASI AKUN BARU =====");

        System.out.print("Masukkan Username: ");
        akun.setUsername(input.nextLine());

        System.out.print("Masukkan Password: ");
        akun.setPassword(input.nextLine());

        System.out.print("Masukkan Email: ");
        akun.setEmail(input.nextLine());

        System.out.print("Masukkan PIN (6 digit): ");
        String pinString = input.nextLine();

        // Validasi Password
        if (!akun.isPasswordValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Password minimal 8 karakter!");
            return;
        }

        // Validasi Email
        if (!akun.isEmailValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Email harus mengandung '@' dan '.' !");
            return;
        }

        // Validasi PIN
        if (!isNumeric(pinString) || pinString.length() != 6) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("PIN harus berupa 6 digit angka!");
            return;
        }

        akun.setPinAngka(Integer.parseInt(pinString));

        // OUTPUT BERHASIL (SESUSAI GAMBAR)
        System.out.println("\n--- REGISTRASI BERHASIL ---");
        System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.\n");

        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
        System.out.println("Email (Uppercase)   : " + akun.getEmail().toUpperCase());
        System.out.println("ID Pengguna (Gabungan): "
                           + akun.getUsername() + akun.getPinAngka());

        // UJI TIPE DATA
        int pinInt = akun.getPinAngka();
        String pinStr = pinString;

        System.out.println("\n--- Uji Tipe Data (PIN Anda: " + pinInt + ") ---");
        System.out.println("PIN (int) + 10      = " + (pinInt + 10));
        System.out.println("PIN (String) + \"10\" = " + pinStr + "10");

        input.close();
    }

    // Cek apakah string adalah angka
    private static boolean isNumeric(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}

