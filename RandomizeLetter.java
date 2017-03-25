package random;

import java.util.Random;
import java.util.Scanner;

public class RandomizeLetter {

	public static void main(String[] args) {
		System.out.println("Podaj liczbê losowanych liter:");
		
		int number = 0;
		
		try {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
	
			}

		catch(Exception e)
	{
		System.err.println("Blad "+e);
	}

	finally
	{
		if (number > 0) {
			Random random = new Random();
			StringBuilder stringBuilder = new StringBuilder();
			int randomize;

			for (int i = 0; i < number; i++) {
				randomize = random.nextInt(26) + 97;
				stringBuilder.append((char) randomize);

			}

			System.out.println(stringBuilder.toString());
		}
	}
}
}