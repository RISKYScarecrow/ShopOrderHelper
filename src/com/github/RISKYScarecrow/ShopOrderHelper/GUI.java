package com.github.RISKYScarecrow.ShopOrderHelper;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends Thread
{
	String message = "Hello :)";
	JLabel label;

	public void run()
	{
		createAndShowGUI();
	}

	public void createAndShowGUI()
	{
		JFrame frame = new JFrame("Console and Log");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		int width = 800;
		int height = 200;
		
		label = new JLabel(message);
		frame.getContentPane().add(label);

		frame.setVisible(true);

		frame.setBounds((1920 - width) / 2, 1050 - height, width, height);	}

	public void updateLabel(String mes)
	{
		label.setText(mes);
	}
}
