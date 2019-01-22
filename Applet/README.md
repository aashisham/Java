
#Applet Progamming:
-Applet ia a java program that runs in a web browser .
-Applet is a java class that extends the java.applet class.
-no main() method 
-Applet are designed to be embedded witnin an Html page
-JVM is required to view an applet .
-Applet have strict security rules that are enforced by the web browser.

##Types of Applet:
###i) Based on Applet class :
-These applet use the abstract window toolkit(AWT) to provide the graphical user interface.
-This style of applet has been availble since java was first created.

###ii) Based on JApplet class:
-are based on the swing class JApplet , which inherits Applet.
-swing applets use the swing classes to provide the GUI.


##Life cycle of applet 
  int()                        start()
------->[Applet iinitialized]---------->[Applet Running]
										 ^         |
		                                 |         |
                             Start()     |         | Stop()
									     |         |
										 |         |
										 |         v 
Applet Destroyed]<--------------------[Applet Stopped]
					   destroy()


##Applet initialization & Termination :
**When an applet begins, the following methods are called in this sequence**: 
(1) '<init()>'
	The init method is the 1st method to be called. this is where variables are initialized. this method is only called ine time of an applet.
(2) '<start()>'
	Start method is called after init method . It is called to re-start an applet after it has been stopped.Start() is called each time an applets document is displayed in screen so if a user leaves a web page and comes back the applet resumes execution at start().
(3) '<paint()>'
  	the paint method is called each time an AWT based applets output must be redrawn. This situation can occur for several reason. Whenever the applet must redraw its output '<paint()>' is called. The '<paint()>' has one parameter of type Graphics.
    
**When an applet is terminated the following sequence of method calls take place:**
(1) '<Stop()>'
	'<Stop()>' is called when a  web browser.You should use stop() to suspend threats that dont need to run when the applet is not visible
(2) '<Destroy()>'  
	the '<Destroy()>' is called when the environment determines that your applets needs to be removed completely from memory. At this point you should free up any resources the applet may be using. The stop() is always called before destroy().         					   
