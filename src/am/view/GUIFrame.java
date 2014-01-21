package am.view;

import javax.swing.JFrame;

import am.controller.GUIController;
/**
 * Framework for a GUI Frame class
 * @author kvah5288
 *@version 1.3 10/22/13
 */

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	/**
	 * 
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,200);
		this.setVisible(true);
	}
}
