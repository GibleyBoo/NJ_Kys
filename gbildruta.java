import java.awt.Dimension;
import java.awt.event.*;


import javax.swing.*;




public class gbildruta {
	private static String bytbild = ("albin2.png");
	private String usedchars = ("test, sfsfs , sfsfsffsfsfsffssf");
	private String usedwords = ("tests");
	private String stringinput = ("");


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

		ginput.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				stringinput = ginput.getText();
				gusedwords.setText(stringinput);
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


public String displayCurrent() {
	return stringinput;
}



public static void main(String[] args) {
	 javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new gbildruta();

         }
	 });
	}
}
