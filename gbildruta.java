import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;


public class gbildruta {
	public static String bytbild = ("shillary.png");
	public String usedchars = ("test, sfsfs , sfsfsffsfsfsffssf");
	public String usedwords = ("tests");

//LÄGG TILL EN LYSSNARE SÅ MAN KAN FÅ UT ETT VÄRDE NÄR MAN SKRIVER IN I TESTFIELD fixa enter o grejer, samt kommentera och prata med jonas
	

	public gbildruta() {
		JFrame jwp = new JFrame();
		JPanel boxpanel = new JPanel();
		JLabel gusedchars = new JLabel(usedchars);
		JLabel gusedwords = new JLabel(usedwords);
		JTextField ginput = new JTextField(30);
		ImageIcon gimg = new ImageIcon(bytbild);
		JLabel xgimg = new JLabel();
		xgimg.setIcon(gimg);
		
		ginput.setMaximumSize(ginput.getPreferredSize() );
		boxpanel.setLayout(new BoxLayout(boxpanel,BoxLayout.Y_AXIS));
		boxpanel.add(xgimg);
		boxpanel.add(Box.createRigidArea(new Dimension(0,7)));
		boxpanel.add(ginput);
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



public static void main(String[] args) {
	 javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new gbildruta();
         } 
	 });
	}
}




