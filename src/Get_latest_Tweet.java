import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Get_latest_Tweet implements ActionListener{
JFrame frame;
JPanel panel;
JButton  button1;
JTextField text;

public static void main(String[] args) {
	new Get_latest_Tweet().createUI();
}
	private void createUI(){
		frame=new JFrame();
		panel=new JPanel();
		button1=new JButton();
		button1.setText("TWEETS");
		text=new JTextField();
		frame.add(panel);
		panel.add(button1);
		panel.add(text);
		frame.setVisible(true);
		frame.pack();
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}



}
