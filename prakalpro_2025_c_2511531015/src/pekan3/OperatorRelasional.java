package pekan3;

import java.util.Scanner;

public class OperatorRelasional {

	public static void main(String[] args) {
		int A1;
		int A2;
		boolean hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("input ankga-2: ");
		A2 = keyboard.nextInt();
	    keyboard.close();
	    hasil = A1 > A2;// apakah A1 lebih besar A1?
	    System.out.println("A1 > A2 = " +hasil);
	    hasil = A1 < A2;// apakah A1 lebih kecil A2? 
	    System.out.println("A1 < A2 = " +hasil);
	    hasil = A1 >=  A2;//apakah A1 besar sama dengan A2?
	    System.out.println("A1 >= A2 = " +hasil);
	    hasil = A1 <= A2;// apakah A1 kecil sama dengan A2?
	    System.out.println("A1 <= A2 = " +hasil);
	    hasil = A1 == A2;// apakah hasil A1 saa dengan A2/
	    System.out.println("A1 == A2 = " +hasil);
	    hasil = A1 != A2;// apakah hasil A1 tidak sama dengan A2?
	    System.out.println("A1 != A2 = " +hasil);
	    
	    		

	}

}
