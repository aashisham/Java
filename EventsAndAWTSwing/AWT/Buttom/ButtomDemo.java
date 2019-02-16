// Demonstrate Buttons

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code="ButtonDemo" width=250 height=150>
	</applet>
*/

public class ButtonDemo extends Applet implements ActionListener {

	String msg = "";
	Button yes, no, maybe;

	public void init() {

		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Undecided");

		add(yes);
		add(no);
		add(maybe);

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {

		String str = ae.getActionCommand();

		if(str.equals("Yes")) {
			msg = "You pressed Yes.";
		}
		else if(str.equals("No")) {
			msg = "You pressed No.";
		}
		else {
			msg = "You pressed Undecided";
		}

		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg, 6, 100);
	}
} 

/*
The action command of the button (which, by default, is its label)  
is used to determine which button has been pressed. The label is 
obtained by calling the getActionCommand( ) method on the 
ActionEvent object passed to actionPerformed( ).
*/
