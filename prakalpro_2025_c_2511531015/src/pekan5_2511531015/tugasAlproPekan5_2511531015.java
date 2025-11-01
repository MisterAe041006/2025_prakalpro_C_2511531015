package pekan5_2511531015;

public class tugasAlproPekan5_2511531015 {


		    public static void main(String[] args) {
		        int dot = 4;
		        int n = 4;

		        // Bagian atas
		        String top = "#";
		        int max = dot * n - 1;
		        for (int i = 0; i < max + 1; i++) {
		            top = top + "=";
		        }
		        top = top + "#";
		        System.out.println(top);

		        // Bagian atas pola
		        for (int i = 0; i < n; i++) {
		            String out = "|";
		            int space = (n - 1) * 2;
		            for (int ii = 0; ii < space - 2 * i; ii++) {
		                out = out + " ";
		            }

		            out = out + "<>";
		            int d = dot * i;
		            for (int ii = 0; ii < d; ii++) {
		                out = out + ".";
		            }
		            out = out + "<>";

		            for (int ii = 0; ii < space - 2 * i; ii++) {
		                out = out + " ";
		            }
		            out = out + "|";
		            System.out.println(out);
		        }

		        // Bagian bawah pola
		        for (int i = 0; i < n; i++) {
		            String out = "|";
		            for (int ii = 0; ii < 2 * i; ii++) {
		                out = out + " ";
		            }

		            out = out + "<>";
		            int d = dot * (n - (i + 1));
		            for (int ii = 0; ii < d; ii++) {
		                out = out + ".";
		            }
		            out = out + "<>";

		            for (int ii = 0; ii < 2 * i; ii++) {
		                out = out + " ";
		            }
		            out = out + "|";
		            System.out.println(out);
		        }

		        // Bagian bawah
		        String bottom = "#";
		        for (int i = 0; i < max + 1; i++) {
		            bottom = bottom + "=";
		        }
		        bottom = bottom + "#";
		        System.out.println(bottom);
		    }
		}
