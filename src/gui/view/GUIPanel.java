package gui.view;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIController;
/**
 * 
 * @author ethr5627
 * @version 1 Nov 9, 2015 Basic Constructor setup
 */
public class GUIPanel extends JPanel 
{

	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Dont click the button");
		firstTextField = new JTextField("Text Here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Loads content into the Panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

