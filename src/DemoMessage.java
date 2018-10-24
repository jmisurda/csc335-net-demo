import java.io.Serializable;

public class DemoMessage implements Serializable {
	private String message;
	private int number;
	
	public DemoMessage(String m, int n) {
		message = m;
		number = n;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return "Message: [" + message + "] Number: [" + number + "]";
	}
}
