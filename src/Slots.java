import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slots implements ActionListener {
JFrame frame;
JPanel Panel;
JButton spin;
JLabel label;
public static void main(String[] args) {
	new Slots().CreateUI();
}
private void CreateUI() {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton spin=new JButton();
	JLabel label1= new JLabel();
	JLabel labell= new JLabel();
	JLabel labe3
	frame.add(panel);
	panel.add(spin);
	panel.add(label1);
	panel
	spin.setText("SPIN");
	spin.addActionListener(this);
	frame.setSize(500, 250);
	frame.setVisible(true);
  
 
}
@Override
public void actionPerformed(ActionEvent e) {

	
}
public static ImageIcon loadImage(String fileName)
{
	try 
	{
		return new ImageIcon(ImageIO.read(new Slots().getClass().getResourceAsStream(fileName)));
	} catch (IOException e) 
	{
		
		return null;
	}
}
}


