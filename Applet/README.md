
# Applet Progamming :
- Applet ia a java program that runs in a web browser .
- Applet is a java class that extends the java.applet class.
- no main() method 
- Applet are designed to be embedded witnin an Html page
- JVM is required to view an applet .
- Applet have strict security rules that are enforced by the web browser.

## Types of Applet:
### i) Based on Applet class :
- These applet use the abstract window toolkit(AWT) to provide the graphical user interface.
- This style of applet has been availble since java was first created.

### ii) Based on JApplet class:
- are based on the swing class JApplet , which inherits Applet.
- swing applets use the swing classes to provide the GUI.


## Life cycle of applet 

![Life cycle of Applet] (https://3.bp.blogspot.com/-l08SH2sXQfg/W7rq_Qm8voI/AAAAAAAAD38/G6P2TLfG1scqzSf-PDYQd23Hjyy-veO6QCLcBGAs/s1600/Life%2BCycle%2Bof%2BApplet.jpeg)
 
 


## Applet initialization & Termination :
**When an applet begins, the following methods are called in this sequence**: 
1. `init()`
	`init()` is the 1st method to be called. this is where variables are initialized. this method is only called ine time of an applet.
2. `start()`
	`start()` is called after init method . It is called to re-start an applet after it has been stopped. `start()` is called each time an applets document is displayed in screen so if a user leaves a web page and comes back the applet resumes execution at  `start()`.
3. `paint()`
  	 `paint()` is called each time an AWT based applets output must be redrawn. This situation can occur for several reason. Whenever the applet must redraw its output `paint()` is called. The `paint()` has one parameter of type Graphics.
    
**When an applet is terminated the following sequence of method calls take place:**
1. `Stop()`
	`Stop()` is called when a  web browser.You should use `Stop()` to suspend threats that dont need to run when the applet is not visible
2. `Destroy()`  
	The `Destroy()` is called when the environment determines that your applets needs to be removed completely from memory. At this point you should free up any resources the applet may be using. The `Stop()` is always called before `Destroy()`.         					   
