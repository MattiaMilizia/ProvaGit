package it.corso.git;

import java.util.Scanner;
	
public class Operazione {
	public static void Menu() {
		System.out.println("Premi 1 per effettuare una somma.");
		System.out.println("Premi 2 per effettuare una sottrazione.");
		System.out.println("Premi 3 per effettuare una una moltiplicazione.");
		System.out.println("Premi 4 per effettuare una divisione.");
		System.out.println("Premi 5 per uscire.");
	}
	public static void main(String[] args) {
		System.out.println("Sono una nuova modifica");
	
	Scanner input = new Scanner(System.in);
	Menu();
	int scelta = input.nextInt();
	while(scelta != 5) {
	switch(scelta) {

	case 1: {
	System.out.println("Hai scelto la somma.");
	System.out.printf("Digita un numero: ");
	float num1 = input.nextFloat();
	System.out.println("Digita un altro numero: ");
	float num2 = input.nextFloat();
	float result = num1+num2;
	System.out.printf("La somma tra "+num1+ " "+num2+ " è "+result+"\n");
	
	break;
	}

	case 2: {
	System.out.println("Hai scelto la sottrazione.");
	System.out.printf("Digita un numero: ");
	float num1 = input.nextFloat();
	System.out.println("Digita un altro numero: ");
	float num2 = input.nextFloat();
	float result = num1-num2;
	System.out.printf("La sottrazione tra "+num1+ " "+num2+ " è "+result+"\n");
	
	break;
	}

	case 3: {
	System.out.println("Hai scelto la moltiplicazione.");
	System.out.printf("Digita un numero: ");
	float num1 = input.nextFloat();
	System.out.println("Digita un altro numero: ");
	float num2 = input.nextFloat();
	float result = num1*num2;
	System.out.printf("La moltiplicazione tra "+num1+ " "+num2+ " è "+result+"\n");
	
	break;
	}

	case 4: {
	System.out.println("Hai scelto la divisione.");
	System.out.printf("Digita un numero: ");
	float num1 = input.nextFloat();
	System.out.println("Digita un altro numero: ");
	float num2 = input.nextFloat();
	float result = num1/num2;
	System.out.printf("La divisione tra "+num1+ " "+num2+ " è "+result+"\n");
	
	break;
	
	}default: {
		System.out.println("Scelta non riconosciuta.");
		break;
		}
		
	}
	Menu();
	scelta = input.nextInt();
	
	}
	System.out.println("Grazie per aver utilizzato il nostro servizio!");
	input.close();
	}
}
