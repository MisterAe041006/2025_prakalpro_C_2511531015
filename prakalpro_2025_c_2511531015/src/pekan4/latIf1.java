package pekan4;
import java.util.Scanner;
public final class latIf1 {

	public static void main(String[] args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.print("input IPK anda = ");
		IPK=input.nextDouble();
		input.close();
		if (IPK>2.75)
			System.out.println("Anda Lulus Sangat Memuaskan dengan IPK "+IPK);

	}

}
