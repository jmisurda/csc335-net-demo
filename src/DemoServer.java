import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4000);
			Socket connection = server.accept();
			ObjectOutputStream output = new
				ObjectOutputStream(connection.getOutputStream());
			ObjectInputStream input = new 
				ObjectInputStream(connection.getInputStream());
		    // Do some IO. 
			
			
			DemoMessage msg ;
			
			do {
				msg = (DemoMessage)input.readObject();
				System.out.println(msg);
			} while(!msg.getMessage().equals("quit"));
			
			
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		      	e.printStackTrace();
		}	

	}

}
