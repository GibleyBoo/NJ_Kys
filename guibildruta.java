import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guibildruta
{
	public static void main(String[] args) 
	  {
		JFrame win = new jonaswindow(); 
		win.show();
		
	}
}

class jonaswindow extends JFrame 
{
	public jonaswindow()
	{
		
		
		
		setTitle("Häng en gubbe - NJ");
		setSize(650,650);
		
		
		ImageIcon testicon = new ImageIcon("albin.png");
		JLabel thumb = new JLabel();
		thumb.setIcon(testicon);
		add(thumb);
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)	
		
		{
			System.exit(0);
		}
		});
	}
}

	