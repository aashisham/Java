
# Applet Progamming :
- Applet ia a java program that runs in a web browser .
- Applet is a java class that extends the `java.applet.Applet` class.
- no `main()` method 
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

![life cycle of applet](https://user-images.githubusercontent.com/33601771/51544904-0123ff80-1e89-11e9-9795-18aeb7a74dbc.jpeg)
 
 


## Applet initialization & Termination :
**When an applet begins, the following methods are called in this sequence**: 
1. `init()` :

	`init()` is the 1st method to be called. this is where variables are initialized. this method is only called ine time of an applet.
2. `start()` :

	`start()` is called after init method . It is called to re-start an applet after it has been stopped. `start()` is called each time an applets document is displayed in screen so if a user leaves a web page and comes back the applet resumes execution at  `start()`.
3. `paint()` :

  	 `paint()` is called each time an AWT based applets output must be redrawn. This situation can occur for several reason. Whenever the applet must redraw its output `paint()` is called. The `paint()` has one parameter of type Graphics.
    
**When an applet is terminated the following sequence of method calls take place:**
1. `Stop()` :

	`Stop()` is called when a  web browser.You should use `Stop()` to suspend threats that dont need to run when the applet is not visible
2. `Destroy()` :

	The `Destroy()` is called when the environment determines that your applets needs to be removed completely from memory. At this point you should free up any resources the applet may be using. The `Stop()` is always called before `Destroy()`. 
	
	
# The HTML APPLET Tag  :

Syntax:
    ```
    <Applet
    [CODEBASE = codebaseURL]
    CODE = appletFile
    [ALT = alternateText]
    [NAME = appletInstanceName]
    Width = pixels
    height = pixels
    [ALIGN = alignment]
    [VSPACE = pixels]
    [HSPACE = pixels]
    >

    [< PARAM NAME = attributeName VALUE = AttributeValue>] 
    [HTML Displayed in the absence of Java]

    </APPLET>
    ```
    *Note : [] -> Optional 
    
 
## CODEBASE :
- It is an optional attribute that specifies the base URL of the applet code, which is the directory that will be searched for the applets executable class file.
- The HTML Document URL Directory is used as the CODEBASE if this attribute is not specified.
## CODE :
-Code is the required attribute that gives the name of file containing compiled .class file. This file is related to the code base UTL of the applet.
## ALT :
- The ALT tag is an alternate tag used to specify a short text message that should be displayed if the browser recognized the applet tag but can't currently run JAVA applet.
## NAME :
-NAME is an optional attribute used to specify a name for the applet instance. NAME attribute is used in order to communicate between applets on the same page.
## WIDTH and HEIGHT :
- WIDTH and HEIGHT are the required attributes that gives the size of the applet display area.
## ALIGN :
- ALIGN is an optional attribute that specifies the alignment of the applet. The possible values are Left, Right, Top, Bottom, Middle, Baseline, Texttop, Absmiddle (Absolute Middle) and Absbottom .
## VSPACE and HSPACE :
- These attributes are optinal.
- VSPACE specifies the space in pixel and below the applet.
- HSPACE specifies the space in pixel on each sides of the applet.
## PARAM NAME and VALUE :
- PARAM tag allows you to specify applet specific arguments.
- Applets access their attributes with the `getParameter( )`

