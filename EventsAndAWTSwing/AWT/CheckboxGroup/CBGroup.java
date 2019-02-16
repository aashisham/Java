import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code="CBGroup" width=240 height=200>
	</applet>
*/

public class CBGroup extends Applet implements ItemListener {

	String msg = "";
	Checkbox apple, banana, mango, grapes;
	CheckboxGroup cbg;

	public void init() {

		cbg = new CheckboxGroup();
		apple = new Checkbox("Apple", cbg, true);
		banana = new Checkbox("Banana", cbg, false);
		mango = new Checkbox("Mango", cbg, false);
		grapes = new Checkbox("Grapes", cbg, false);

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
		 msg = "Current selection: ";     
		 msg += cbg.getSelectedCheckbox().getLabel();     
		 g.drawString(msg, 6, 100); 
	}
}
