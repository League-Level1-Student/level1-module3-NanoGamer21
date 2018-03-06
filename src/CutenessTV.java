import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
JFrame frame;
JPanel panel;
JButton Button1;
JButton button2;
JButton button3;
public static void main(String[] args) {
	new CutenessTV().createUI();
}
	private void createUI() {
	// TODO Auto-generated method stub
	frame=new JFrame();
	panel=new JPanel();
	JButton Duck = new JButton();
	JButton Frog = new JButton();
	JButton unicorn= new JButton();
	frame.add(panel);
	frame.setSize(5000,10000);
	panel.add(unicorn);
	panel.add(Frog);
	panel.add(Duck);
	Duck.addActionListener(this);
	Frog.addActionListener(this);
	unicorn.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	Duck.setText("Duck");
	Duck.setSize(500, 1000);
	Frog.setText("Frog");
	Frog.setSize(500,1000);
	unicorn.setText("Unicorn");
	unicorn.setSize(500,1000);
	
}
	void showDucks() {
	        playVideo("Drirjl5K9Yk");
	    }

	    void showFrog() {
	        playVideo("aSjCb-FfxhI");
	    }
	    
	    void showFluffyUnicorns() {
	        playVideo("qRC4Vk6kisY");
	    }

	    void playVideo(String videoID) {
	        try {
	    URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
	            java.awt.Desktop.getDesktop().browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
