import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mole_Wack implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton Button;
	JButton Button1;
public static void main(String[] args) {
	new Mole_Wack().createUI();
	new Mole_Wack().drawButtons();
}
void drawButtons() {
	Random randy = new Random();
	randy.nextInt();
	for (int i = 0; i < randy; i++) {
		
	}
	
}
 void createUI() {
	frame = new JFrame();
	panel = new JPanel();
	Button = new JButton();
	Button1 = new JButton();
	frame.add(panel);
	panel.add(Button);
	panel.add(Button1);
	Button.addActionListener(this);
	Button1.addActionListener(this);
	Treat.setText("Treat");
	Trick.setText("Trick");
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
