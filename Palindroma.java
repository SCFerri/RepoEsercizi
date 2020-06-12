package esercizi;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire parola");
		String frase = scan.next();
		scan.close();
		
		if (controlloFrase(frase)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	public static boolean controlloFrase(String frase) {
		if (frase.charAt(0) == frase.charAt(frase.length() - 1)) {
			return true;
			} else {
			return false;
		}
	}

}
