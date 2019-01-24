import java.awt.*;
import java.applet.*;

class LifeCycleApplet extends Applet
{
	String msg;
	public void init()
	{
		msg+="Inside init";
		System.out.println("inside init");
	}
	public void destroy()
	{
		msg+="Inside destroy";
	}


   start()
   {
   		msg+="Inside start";
   }
   paint(Graphics g)
   {
   	msg+="Inside graphics";
   	g.drawString(msg,100,100);
   }
   void stop()
   {
   	msg+="Inside stop";

   }
}
