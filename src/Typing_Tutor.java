import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
 JFrame frame;
JPanel panel;
JLabel label;
char letter= generateRandomLetter();
public static void main(String[] args) {
	new Typing_Tutor().createUI();
	
	
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
	label.setText(letter+" ");
	frame.add(panel);
	panel.add(label);
	frame.addKeyListener(this);
	frame.pack();
	}
	 char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	if(arg0.getkeychar){
		
		
		
	}
}
}
