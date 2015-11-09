package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{

	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
	}
}
