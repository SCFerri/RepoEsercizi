package esercizi;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire parola");
		String frase = scan.nextLine();
		scan.close();
		
		if (controlloFrase(frase)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	public static boolean controlloFrase(String frase) {
		String[] array = frase.split("");
		for (int i = 0; i < array.length/2; i++) {
			int x= array.length-i-1;
			if (!array[i].equalsIgnoreCase(array[x]) ) {
				return false;
			}
		}	
		return true;
	}

}
