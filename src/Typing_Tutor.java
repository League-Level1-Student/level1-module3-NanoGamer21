import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {
 JFrame frame;
JPanel panel;
JLabel label;
public static void main(String[] args) {
	new Typing_Tutor().createUI();
	 new Typing_Tutor().generateRandomLetter();
	
}
	private void createUI(){
	frame=new JFrame();
	panel=new JPanel();
	label=new JLabel();
	frame.setVisible(true);
	frame.setTitle("Type or die");
	frame.setPreferredSize(new Dimension(1000, 500));
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(label.CENTER); 
	label.setText(a);
	frame.add(panel);
	panel.add(label);
	frame.pack();
}
	 char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}

