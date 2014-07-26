package com.github.RISKYScarecrow.ShopOrderHelper;


import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class ShopOrderHelper {
	
	public static ExtendedRobot robot;
	public static Toolkit toolkit;
	public static Clipboard clipboard;
	
	public static void main(String[] args) 
	{

		try 
		{
			robot = new ExtendedRobot();
			toolkit = Toolkit.getDefaultToolkit();
			clipboard = toolkit.getSystemClipboard();
			
			
			robot.delay(5000);
			/*
			robot.keyUse(KeyEvent.VK_H);
			robot.keyUse(KeyEvent.VK_I);
			robot.keyUse(KeyEvent.VK_SPACE);
			robot.keyUse(KeyEvent.VK_B);
			robot.keyUse(KeyEvent.VK_U);
			robot.keyUse(KeyEvent.VK_D);
			robot.keyUse(KeyEvent.VK_D);
			robot.keyUse(KeyEvent.VK_Y);
			*/
			
			robot.moveSelect(500, 40);
			
			System.out.println(robot.readSelected());
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}