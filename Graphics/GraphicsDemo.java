
import java.awt.*;
import java.applet.Applet;
import java.applet.Applet.*;

/*
<applet code = "GraphicsDemo" height = "300" width = "300"></applet>
*/

public class GraphicsDemo extends Applet {
	
	public void paint(Graphics g)
	{
		
		// making Hello world in red and GCES in green color
		Font f1 = new Font("Sans Serif", Font.BOLD + Font.ITALIC , 30);
		g.setFont(f1);
		g.setColor(new Color(255,0,0));
	    g.drawString("Hello World!",100,100);
		Font f = new Font("Serif",Font.ITALIC, 20);
		g.setFont(f);
		g.setColor(new Color(0,255,0));
		g.drawString("GCES",120,120);
		
	    // making rectangle 	
		g.fillRect(140,160,20,50);

		g.setColor(new Color(0,0,255));
		g.setFont(new Font("Serif",Font.BOLD,30));
		g.drawString("AASIS - The Birthday Boy",300,300);
		

		//font metrics
		FontMetrics fm;
		fm = g.getFontMetrics();
		int x = fm.getAscent();
		System.out.println(x);
        // fm.getAscent();
		
        // This segment includes drawing rectangle using 4 lines
		g.drawLine(20, 20, 90, 20);
		g.drawLine(20, 20, 20, 60);
		g.drawLine(20, 60, 90, 60);
		g.drawLine(90, 20, 90, 60);
		
        // Making oval and filling with blue color
		g.setColor(new Color(0,0,255));
		g.fillOval(180, 200, 70, 90);
		
        // Making arc 
		g.drawArc(400, 600, 120, 180, 0, 270);  //positive arc
		g.drawArc(200, 600, 120, 180, 0, -270);  // negative arc
		
        // pacman
		g.fillArc(10, 400, 120, 120, -30, -300);
		
        // polygon with green outline
		g.setColor(new Color(0,255,0));
		int[] xValue = {200,400,500,600 ,200,150};
		int[] yValue = {500,500,600,800,800,600};
		Polygon p = new Polygon(xValue , yValue,6);
		g.drawPolygon(p);
		
       // another polygon with color filled
		Polygon polygon = new Polygon();
		polygon.addPoint(650,350);
		polygon.addPoint(750,500);
		polygon.addPoint(700,000);
		polygon.addPoint(800, 200);
		g.fillPolygon(polygon);
		
        // polylines
		Polygon pl = new Polygon();
		int[] xPoints = {550,670,670,550};
		int[] yPoints = {560,560,690,690};
		g.drawPolyline(xPoints, yPoints, 4);
			
		
	}
	
}
