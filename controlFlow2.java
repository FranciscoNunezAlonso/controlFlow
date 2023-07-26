import java.util.Scanner;
public class controlFlow2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresar edad: ");
		int edad = in.nextInt();
		double costo;
		costo = 60;
		double total=0;
		if (edad > 60) {
			total = costo * 0.55;
		} else if (edad < 5 ) {
			total = costo * 0.60;
		} else {
			total = costo - 7;
		}
		System.out.println("El total es de: " + (total));
		in.close();
	}
	}