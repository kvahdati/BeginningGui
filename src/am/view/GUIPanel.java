package am.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import am.controller.GUIController;
import javax.swing.JTextArea;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!!");
		secondButton = new JButton("wow a second button");
		thirdButton = new JButton("Wow an amazing third button");
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 45, SpringLayout.EAST, firstButton);
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		this.add(thirdButton);
		
	
	}
	
	private void setupLayout()
	{
		
	}
}
