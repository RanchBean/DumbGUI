package gui.controller;

import gui.view.GUIFrame;

public class GUIController 
{
/**
 * Reference to GUIframe object of View.
 */
	private GUIFrame baseFrame;
	
	public void GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	public void start()
	{}
	
}
