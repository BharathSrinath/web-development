package exception_handling;

public class NegativeNumberException extends Exception {
	private static final long serialVersionUID = 1L;
	public NegativeNumberException(String message) {
		super(message);
	}

}
