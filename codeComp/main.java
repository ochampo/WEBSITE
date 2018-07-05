
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
 import java.io.*;
public class main {


private static final int portnumber =12345;// port number


public static void main (String [] args)
{

	ServerSocket serverSocket = null;
	try 
	{


		System.out.print("server starting at port number: " + portnumber);
		serverSocket= new ServerSocket(portnumber);

	// client  connecting \\
	//
	//
	System.out.println(" waiting for client to connect " );
	Socket socket = serverSocket.accept();
	System.out.println(" A client has connected" );
    //send a message to to the client 
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
// the message does not want to be sent
	bw.write(" This is a message from the server. ");
	bw.newLine();// this is to end the client 
	bw.flush();


	BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	String data;
	while((data = br.readLine())!= null)
		System.out.println( " message from client:" + data);

	    System.out.println("server has ended");

	
	
	
	}// this is for the try 
	catch(IOException e)
	{
		e.printStackTrace();
	}// the catch 

    
}//little main 

}//main 
