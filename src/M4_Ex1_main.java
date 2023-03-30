import java.util.Scanner;

public class M4_Ex1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables:
		int edat = 0;
		String nom = "";
		String cognom = " ";
		
		//Boli:
		Scanner input = new Scanner(System.in);
		
		//Lògica:
		System.out.println("Introdueix el teu nom: ");
		nom = input.next();
		System.out.println("Introdueix el teu cognom: ");
		cognom = input.next();
		System.out.println("Quina es la teva edat?: ");
		edat = input.nextInt();
		
		//Estructura condicional:
		if (edat >=18) {System.out.println(nom + " " + cognom + " ,bravo!, Ets major d´edat! Pots veure el proper contingut");}
		else {System.out.println(nom + " " + cognom + " ,llástima!, Ets menor d´edat! No pots veure el proper contingut");}
	
	}

}
