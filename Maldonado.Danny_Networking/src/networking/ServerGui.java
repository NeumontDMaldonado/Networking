package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerGui extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Socket socket;
	int answer;

	JLabel label;
	public ServerGui()
	{
		ServerSocket listen;
		label = new JLabel();
		try 
		{
			listen = new ServerSocket(1146);
			socket = listen.accept();
			System.out.println("Connected");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		randomGuess();
		add(label);
	}
	
	private void randomGuess()
	{
		Random gen = new Random();
		answer = gen.nextInt(100);
		
		label.setText(Integer.toString(answer));
	}
}
