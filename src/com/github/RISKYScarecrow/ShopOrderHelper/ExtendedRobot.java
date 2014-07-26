package com.github.RISKYScarecrow.ShopOrderHelper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class ExtendedRobot extends Robot
{

	public ExtendedRobot() throws AWTException {
		super();
	}
	
	public void keyUse(int kc){
		keyPress(kc);
		delay(50);
		keyRelease(kc);
	}
	
	public void moveSelect(int _x, int _y){
		mouseMove(_x, _y);
		mousePress(InputEvent.BUTTON1_MASK);
		delay(10);
		mouseRelease(InputEvent.BUTTON1_MASK);
		
		keyPress(KeyEvent.VK_CONTROL);
		keyUse(KeyEvent.VK_A);
		keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public String readSelected(){
		keyPress(KeyEvent.VK_CONTROL);
		keyUse(KeyEvent.VK_C);
		keyRelease(KeyEvent.VK_CONTROL);
		
		String result = null;
		
		try {
			result = (String) ShopOrderHelper.clipboard.getData(DataFlavor.stringFlavor);
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
