import java.awt.*;
import java.applet.Applet;

/* <applet code = NepalFlag width = 300 height = 300> </applet>  */

public class NepalFlag extends Applet 
{
	int x[] = {10,80,30,80,10};
	int y[] = {10, 60, 60, 120, 120};

	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillPolygon(x,y,5);
		g.setColor(Color.blue);
		g.drawPolygon(x,y,5);
		g.setColor(Color.white);
		g.fillOval(20,85,20,20);
		g.drawArc(20,30,20,20,0,-180);
		g.setColor(Color.green);
		g.drawLine(10,120,10,160);

		showStatus("National flag of nepal");
	}
}
