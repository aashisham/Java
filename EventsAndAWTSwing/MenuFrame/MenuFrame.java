import java.awt.*;
import java.applet.*;


//create a subclass of Frame
public class MenuFrame extends Frame {
	
	MenuFrame(String title){
		super(title);
		
		//create menu bar and add it to frame
		
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		
		//create the menu items
		 
		Menu file = new Menu("File");
		MenuItem item1, item2, item3, item4;
		file.add(item1 = new MenuItem("New"));
		
		// create sub menu for Open
		Menu sub = new Menu("Open...");
		MenuItem item15, item16 ;
		sub.add(item15 = new MenuItem("Notepad"));
		sub.add(item16 = new MenuItem("Sublime Text"));
		file.add(sub);            //adding submenu items to the main menu item"Open"
		
		file.add(item2 = new MenuItem("Save"));
		file.add(item3 = new MenuItem("-"));
		file.add(item4 = new MenuItem("Exit"));
		mbar.add(file);
		
		Menu edit = new Menu("Edit");
		MenuItem item6, item7, item8, item9, item10 ,item11 ;
		edit.add(item6 = new MenuItem("Undo"));
		edit.add(item7 = new MenuItem("-"));
		edit.add(item8 = new MenuItem("Cut"));
		edit.add(item9 = new MenuItem("Copy"));
		edit.add(item10 = new MenuItem("Paste"));
		edit.add(item11 = new MenuItem("Delete"));
		mbar.add(edit);
		
		Menu view = new Menu("View");
		MenuItem item12, item13, item14;
		view.add(item12 = new MenuItem("Large Icons"));
		view.add(item13 = new MenuItem("Medium Icons"));
		view.add(item14 = new MenuItem("Small Icons"));
		mbar.add(view);
		
	}
	public static void main(String[] args) {
		MenuFrame mframe = new MenuFrame("Menu");
		mframe.setSize(450,400);
		mframe.setVisible(true);
	}

}
