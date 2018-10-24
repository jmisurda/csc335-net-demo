import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;
import java.util.Scanner;

public class DemoClient {

	public static void main(String[] args) {
		try {
			Socket server = new Socket("localhost", 4000);
			ObjectOutputStream output = new
				ObjectOutputStream(server.getOutputStream());
			ObjectInputStream input = new 
				ObjectInputStream(server.getInputStream());
			
			
			// Do some IO with the server
			String message;
			int number = 0;
			Scanner userInput = new Scanner(System.in);
			do {
				message = userInput.nextLine();
				output.writeObject(new DemoMessage(message, number++));
				
			} while(!message.equals("quit"));
			
			server.close();     
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
