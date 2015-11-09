package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
/**
 * creates the Frame for the GUI.
 * @author ethr5627
 * @version 1.1 Nov 9, 2015 Added a reference to the GUIPanel and Installed it as content pane 
 * Added the setupFrame
 */
public class GUIFrame extends JFrame
{

	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GUIPanel(baseController); //Creates an instance of GUIPanel with reference to controller
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Sets the panel in the GUIFrame Required.
		this.setResizable(false); //Usually a good idea but not required.
		this.setSize(420,420); //Sets size.
		this.setVisible(true); //Must be last line code in setupFrame method.
	}
}
