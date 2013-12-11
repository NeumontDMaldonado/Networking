package networking;

import javax.swing.JFrame;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ServerGui server = new ServerGui();
		frame.getContentPane().add(server);
		
		frame.setVisible(true);
		frame.setSize(100, 100);
	}
}
