package exception;

public class InvalidNameException extends Exception { // Exception è una classe precostruita per gestire gli errori

	public InvalidNameException(String message) {
		super(message);
	}
}
