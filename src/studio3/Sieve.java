package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What number do you find to find prime numbers up to?");
		int n = in.nextInt();
		Boolean[] primeNumbers = new Boolean[n + 1];
		Arrays.fill(primeNumbers, true);
		primeNumbers[0] = false;
		primeNumbers[1] = false;

		for (int i = 2; i <(Math.sqrt(primeNumbers.length)); i++) {
			for (int j = i; j < (primeNumbers.length); j++) {

				if ((i * j) < primeNumbers.length)
					primeNumbers[j * i] = false;

			}

		}

		for (int x = 0; x < primeNumbers.length; x++) {
			if (primeNumbers[x] == true)
				System.out.println(x);
		}

	}

}
