import java.awt.*;
import java.awt.event.*;

public class FlagOfNepal extends Frame
{
	FlagOfNepal()
	{
		// Frame frame = new Frame(); extends frame lekhya vayera yo na lekhni
		setTitle("Nepali Flag");
		setSize(800,800);
		setVisible(true);


	}
	public void paint(Graphics g)
	{	

// for drawing blue outer border of flag
		g.setColor(new Color(0,56,147));
		int [] x1Points = {300,725,450,700,300,300};
		int [] y1Points = {320,600,600,850,850,320};
		g.fillPolygon(x1Points,y1Points,6);

// for drawing red inner part of flag
		g.setColor(new Color(220,20,60));
		int [] x2Points = {320,665,410,660,320,320};
		int [] y2Points = {355,580,580,830,830,320};
		g.fillPolygon(x2Points,y2Points,6);

// for  white colored sun
		g.setColor(Color.WHITE);
		g.fillArc(345,665,115,115,0,360);


// for  moon 
		// white colored arc
		g.setColor(Color.WHITE);
		g.fillArc(345,449,120,120,0,360);

		//for red colored circle 
		// red colored circle
		g.setColor(new Color(220,20,60));
		g.fillArc(345,423,120,120,0,360);

		// white colored arc
		g.setColor(Color.WHITE);
		g.fillArc(368,485,75,75,0,360);


	}


	public static void main(String[] args) {
	FlagOfNepal fon=new FlagOfNepal();
	}
}
