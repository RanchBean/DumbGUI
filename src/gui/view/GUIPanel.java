package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
/**
 * 
 * @author ethr5627
 * @version 1 Nov 9, 2015 Basic Constructor setup
 */
public class GUIPanel extends JPanel 
{

	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}
}
