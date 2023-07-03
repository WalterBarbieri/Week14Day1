package Esercizio2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App2 {
	private static Logger logger = LoggerFactory.getLogger(App2.class);

	public static void main(String[] args) {
		calcolaConsumo();
	}

	public static void calcolaConsumo() {
		Scanner myScanner = new Scanner(System.in);
		try {
			logger.info("Inserire i km percorsi");
			double km = myScanner.nextDouble();

			logger.info("Inserire i litri consumati");
			double lt = myScanner.nextDouble();

			if (lt == 0) {
				throw new ArithmeticException("Hai inventato il motore infinito!");
			} else if (lt < 0 || km < 0) {
				throw new ArithmeticException("Non barare, non esistono km o lt negativi!");
			}

			double consumo = km / lt;
			logger.info("Hai percorso: " + String.valueOf(consumo) + " km/lt");

		} catch (ArithmeticException e) {
			logger.error("Attenzione: " + e.getMessage());
		} catch (Exception e) {
			logger.error("Attenzione: input non valido");
		} finally {
			myScanner.close();
		}

	}

}
