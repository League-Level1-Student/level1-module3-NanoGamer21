import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_surprise implements ActionListener {
JFrame frame;
JPanel panel;
JButton Trick;
JButton Treat;
public static void main(String[] args) {
	new Nasty_surprise().createUI();
}
 void createUI() {
	frame = new JFrame();
	panel = new JPanel();
	Trick = new JButton();
	Treat = new JButton();
	frame.add(panel);
	panel.add(Treat);
	panel.add(Trick);
	Treat.addActionListener(this);
	Trick.addActionListener(this);
	Treat.setText("Treat");
	Trick.setText("Trick");
	frame.setVisible(true);
	frame.pack();
	
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==Treat) {
		showPictureFromTheInternet("https://c.ndtvimg.com/iutd8o0k_momo-challenge-instagram_625x300_07_August_18.jpg");
	}
	if(arg0.getSource()==Trick) {
		showPictureFromTheInternet("https://www.readersdigest.ca/wp-content/uploads/sites/14/2013/03/6-facts-to-know-before-owning-a-puppy.jpg");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}
