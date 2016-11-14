import java.awt.Dimension;
import java.awt.event.*;


import javax.swing.*;



public class gbildruta  {
	
	  String bytbild = ("albin2.png");
	  String usedchars = ("not memes");
	  String usedwords = ("tests");
	  String testmeme = new String(hangman.ordgissDisplay());
	private  String stringinput = (".");

	
	


	public  gbildruta() {
		JFrame jwp = new JFrame();
		JPanel boxpanel = new JPanel();
		JLabel gusedchars = new JLabel(usedchars);
		JLabel gusedwords = new JLabel(usedwords);
		JLabel blankDisplay = new JLabel("testmeme");
		JTextField ginput = new JTextField(30);
		ImageIcon gimg = new ImageIcon(bytbild);
		JLabel xgimg = new JLabel();
		xgimg.setIcon(gimg);
		
		ginput.setMaximumSize(ginput.getPreferredSize() );
		boxpanel.setLayout(new BoxLayout(boxpanel,BoxLayout.Y_AXIS));
		boxpanel.add(xgimg);
		boxpanel.add(Box.createRigidArea(new Dimension(0,7)));
		boxpanel.add(blankDisplay);
		boxpanel.add(Box.createRigidArea(new Dimension(0,7)));
		boxpanel.add(ginput);
		
		ginput.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				stringinput = ginput.getText();
				gusedwords.setText(stringinput);
			//make so jtextfield "ginput" clears text
			}
		});
		
		boxpanel.add(Box.createRigidArea(new Dimension(0,7)));
		boxpanel.add(gusedchars);
		boxpanel.add(Box.createRigidArea(new Dimension(0,7)));
		boxpanel.add(gusedwords);
		jwp.add(boxpanel);
		jwp.setSize(650,900);
		jwp.setResizable(true);
		jwp.setVisible(true);
		
		
		jwp.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	
		
				{
					System.exit(0);
				}
			  } 
			});
		
	}
	
	public String getStringInput(){
		return stringinput;
	}




}




