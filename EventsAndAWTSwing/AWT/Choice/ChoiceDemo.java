import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ChoiceDemo" width=300 height=180>
</applet>
*/

public class ChoiceDemo extends Applet implements ItemListener {

	String msg = "";
	Choice os, browser;

	public void init() {

		os = new Choice();
		browser = new Choice();

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

		// add choice list to window
		add(os);
		add(browser);

		// register to receive item events
		os.addItemListener(this);
		browser.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}

	// display current selection
	public void draw(Graphics g) {
		 msg = "Current OS: ";     
		 msg += os.getSelectedItem();     
		 g.drawString(msg, 6, 120);     
		 msg = "Current Browser: ";     
		 msg += browser.getSelectedItem();     
		 g.drawString(msg, 6, 140);   
	}
}
