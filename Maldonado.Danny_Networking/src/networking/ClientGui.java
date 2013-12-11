package networking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientGui extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Socket socket;
	JTextField field;
	JLabel result;

	public ClientGui()
	{
		try 
		{
			socket = new Socket("localhost",1146);
			System.out.println("Connected to server");
		} 
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel label = new JLabel("Enter guess");
		result = new JLabel();
		field = new JTextField(5);
		field.addActionListener(new FieldListener());
		add(label);
		add(field);
		add(result);
		
	}
	
	private class FieldListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			ServerGui server = new ServerGui();
			String text = field.getText();
			int guess = Integer.parseInt(text);
			if(guess > server.answer)
			{
				result.setText("Too high");
			}
			else if(guess == server.answer)
			{
				result.setText("Correct");
			}
			else
			{
				result.setText("Too low");
			}
		}
		
	}
}
