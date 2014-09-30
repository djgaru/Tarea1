
import java.util.Scanner;

public class Main {

	//Edgar Alfonso Pérez Hernández
	//Carnet: 201021195
	
public static void main(String[] args) {
	Scanner x =	 new Scanner(System.in);
	int numero;
	System.out.println("Ingrese un numero: ");
	numero = x.nextInt();
	int cont;
		for ( cont = 0; cont <= numero; ++cont ) {
			if ((cont%2) == 0) {
			System.out.println("Si es un numero primo "+cont);
			} 
				else {
					System.out.println("No es un numero primo "+cont);
				}
			}
		}
}   