package exception;

public class NumberLessThanZeroException extends Exception {
	public NumberLessThanZeroException(int number) {
		super("Il numero inserito " + number + " è minore di 0.");
	}
}
