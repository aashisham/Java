import java.awt.*;
import java.applet.*;

public class HelloApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet!How are you?",500,1000);
	}
}


//to run 
// javac HelloApplet.java
// appletviewer HelloApplet

// or
// ececute html file as following :

// HelloApplet.html
// <html>
// <head>
// 	<title>Applet Demo</title>
// </head>
// <body>

// 	<applet code="HelloApplet" width="300" height="400" alt="cannot run">
		
// 	</applet>
// </body>
// </html>
