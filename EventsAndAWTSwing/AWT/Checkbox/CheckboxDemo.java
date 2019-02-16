import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CheckboxDemo" width=240 height=200>
</applet>
*/

public class CheckboxDemo extends Applet implements ItemListener {

	String msg = "";
	Checkbox apple, banana, mango, grapes;

	public void init() {

		apple = new Checkbox("Apple", null, true);
		banana = new Checkbox("Banana");
		mango = new Checkbox("Mango");
		grapes = new Checkbox("Grapes");

		add(apple);
		add(banana);
		add(mango);
		add(grapes);

		apple.addItemListener(this);
		banana.addItemListener(this);
		mango.addItemListener(this);
		grapes.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}

	public void paint(Graphics g) {
		 msg = "Current state: ";     
		 g.drawString(msg, 6, 80);     
		 msg = "  Apple  : " + apple.getState();     
		 g.drawString(msg, 6, 100);     
		 msg = "  Banana : " + banana.getState();     
		 g.drawString(msg, 6, 120);     
		 msg = "  Mango  : " + mango.getState();     
		 g.drawString(msg, 6, 140);     
		 msg = "  Grapes : " + grapes.getState();     
		 g.drawString(msg, 6, 160);   
	}
}
