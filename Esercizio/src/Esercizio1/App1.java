package Esercizio1;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

	private static Logger logger = LoggerFactory.getLogger(App1.class);
	private static int[] myArray = new int[5];

	public static void main(String[] args) {

		createRandomArray();
		changeNumber();
	}

	public static void createRandomArray() {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10 + 1);
			logger.info((i + 1) + " : " + myArray[i]);
		}
	}

	public static void changeNumber() {
		int selectIndex;
		Scanner myScanner = new Scanner(System.in);
		do {
			logger.info("Seleziona l'indice da modificare (premere 0 per terminare il processo): ");
			if (myScanner.hasNextInt()) {
				selectIndex = myScanner.nextInt();
				if (selectIndex == 0) {
					logger.info("Processo terminato");
					myScanner.close();
					break;
				} else if (selectIndex < 0 || selectIndex > myArray.length) {
					logger.error("Inserire un numero intero compreso tra 0 e 5");
					myScanner.nextLine();
					continue;
				} else {
					logger.info("Hai selezionato l'indice numero: " + selectIndex + " di valore: "
							+ myArray[selectIndex - 1] + ". Con che cifra intera lo vuoi sostituire?");
					if (myScanner.hasNextInt()) {
						int newNumber = myScanner.nextInt();
						myArray[selectIndex - 1] = newNumber;
						for (int i = 0; i < myArray.length; i++) {
							logger.info((i + 1) + " : " + myArray[i]);
						}
					} else {
						logger.error("Inserire un numero intero");
						myScanner.nextLine();
						myScanner.nextLine();
						continue;
					}

				}
			}

			else {
				logger.error("Inserire un numero intero");
				myScanner.nextLine();
				continue;
			}

		} while (true);
	}

}
