package gui.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		this.setLayout(baseLayout); //Needs to be first line of setupPanel method.
		this.add(firstButton);
		this.add(firstTextField);
	}
	/**
	 * Dumping ground to hold ugly GUI code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 22, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 134, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 33, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 186, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("don't click or you'll be visited by the devil");
			}
		});
	}
}

