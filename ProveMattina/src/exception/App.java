package exception;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws NumberLessThanZeroException {

		try {
			log.info("La somma è: " + sum());
			;
		} catch (NumberLessThanZeroException e) {
			e.printStackTrace();
		}
	}

	public static int sum() throws NumberLessThanZeroException {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Inserisci primo addendo");
		int num1 = Integer.parseInt(myScanner.nextLine());
		if (num1 < 0) {
			myScanner.close();
			throw new NumberLessThanZeroException(num1);
		}

		System.out.println("Inserisci secondo addendo");
		int num2 = Integer.parseInt(myScanner.nextLine());
		if (num2 < 0) {
			myScanner.close();
			throw new NumberLessThanZeroException(num2);
		}
		myScanner.close();
		return (num1 + num2);

	}

}
