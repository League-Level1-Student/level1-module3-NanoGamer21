import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

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
		text=new JTextField(50);
		frame.add(panel);
		panel.add(button1);
		panel.add(text);
		frame.setVisible(true);
		frame.pack();
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()==button1) {
	String input=text.getText();
	String output= getLatestTweet(input);
	System.out.println(output);
}
}



private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();
    AccessToken accessToken = new AccessToken(
            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
        QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }
}



}




