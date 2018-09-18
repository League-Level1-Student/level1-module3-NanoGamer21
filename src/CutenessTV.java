import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
JFrame frame;
JPanel panel;
JButton Duck;
JButton Frog;
JButton unicorn;
public static void main(String[] args) {
	new CutenessTV().createUI();
}
	void createUI() {
	// TODO Auto-generated method stub
	frame=new JFrame();
	panel=new JPanel();
	 Duck = new JButton();
	 Frog = new JButton();
	 unicorn= new JButton();
	frame.add(panel);	
	panel.setSize(10000, 50000);
	frame.setSize(500,100);
	panel.add(unicorn);
	panel.add(Frog);
	panel.add(Duck);
	Duck.addActionListener(this);
	Frog.addActionListener(this);
	unicorn.addActionListener(this);
	frame.setVisible(true);
	Duck.setText("Duck");
	Duck.setSize(500, 1000);
	Frog.setText("Frog");	
	panel.setSize(10000, 50000);
	Frog.setSize(500,1000);
	unicorn.setText("Unicorn");
	unicorn.setSize(500,1000);
	frame.pack();
}
	
	void showDucks() {
	        playVideo("Drirjl5K9Yk");
	    }

	    void showFrog() {
	        playVideo("aSjCb-FfxhI");
	    }
	    
	    void showFluffyUnicorns() {	panel.setSize(10000, 50000);
	        playVideo("qRC4Vk6kisY");
	    }

	    void playVideo(String videoID) {
	        try {
	    URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
	            java.awt.Desktop.getDesktop().browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource()==Duck){
				showDucks();
			}
			if(arg0.getSource()==Frog) {
				showFrog();
			}
			if(arg0.getSource()==unicorn) {
				showFluffyUnicorns();
			}
		}

}
