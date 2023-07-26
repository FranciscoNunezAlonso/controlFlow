import java.util.Scanner;
public class controlFlow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresar el monto: ");
		double monto = in.nextDouble();
		double montoInt=0;
		if (monto >= 10000) {
            montoInt = 30;
        } else if (monto >= 5001 && monto <= 9999) {
            montoInt = 20;
        } else if (monto >= 1001 && monto <= 4999) {
            montoInt = 10;
        } else {
            montoInt = 0;
        }
		System.out.println("Su descuento es de: " + (montoInt) + "%.");
		in.close();
	}
}