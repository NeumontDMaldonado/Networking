package networking;

import javax.swing.JFrame;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ClientGui client = new ClientGui();
		frame.getContentPane().add(client);
		
		frame.setVisible(true);
		frame.setSize(100, 100);
	}

}
