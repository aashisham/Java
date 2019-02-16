import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ListDemo" width=300 height=180>
</applet>
*/

public class ListDemo extends Applet implements ActionListener {

	String msg = "";
	List os, browser;

	public void init() {

		os = new List(4, true);
		browser = new List(4, true);

		// add items to os list
		os.add("Windows");
		os.add("Android");
		os.add("Mac OS");
		os.add("Solaris");

		// add items to browser list
		browser.add("Chrome");
		browser.add("Firefox");
		browser.add("Opera");
		browser.add("Internet Explorer");

		browser.select(1);

		// add list to window
		add(os);
		add(browser);

		// register to receive action events
		os.addActionListener(this);
		browser.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ie) {
		repaint();
	}

	// display current selection
	public void paint(Graphics g) {
		 
		int[] idx; 
 
    	msg = "Current OS: ";     
    	idx = os.getSelectedIndexes();     
    	for(int i=0; i<idx.length; i++) {      
    		msg += os.getItem(idx[i]) + "  ";
    	}     
    	g.drawString(msg, 6, 120);     
    	msg = "Current Browser: ";     
    	msg += browser.getSelectedItem();     
    	g.drawString(msg, 6, 140);    
	}
}
