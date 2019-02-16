import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args)
	{
		try {
			
			//step 1 : first ,server should instatiate ServerSocket object
			ServerSocket ss = new ServerSocket(6666);

			// Step 2 : Then, Server object envokes accept() method of ServerSocket class. This waits for client until client creates Socket object.
			Socket s = ss.accept();  //establish connection 
			
			// This gets the message sent by the client.
			DataInputStream dis =new DataInputStream(s.getInputStream());

			// Typehinting the UTF message into string
			String str = (String)dis.readUTF();

			System.out.print("message"+str);

			ss.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
