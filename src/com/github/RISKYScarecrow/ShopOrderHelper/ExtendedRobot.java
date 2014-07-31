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
	int delayLength;
	
	public ExtendedRobot() throws AWTException
	{
		super();
		delayLength = 10;
	}
	public ExtendedRobot(int delayLength)throws AWTException
	{
		super();
		this.delayLength = delayLength;
	}

	public void keyUse(int keyCode)
	{
		keyPress(keyCode);
		
		delay(delayLength);
		
		keyRelease(keyCode);
	}

	public void moveSelect(int _x, int _y)
	{
		mouseMove(_x, _y);
		delay(delayLength);
		mousePress(InputEvent.BUTTON1_DOWN_MASK);
		delay(delayLength);
		mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		boolean on = false;
		if (ShopOrderHelper.toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK))
		{
			keyUse(KeyEvent.VK_NUM_LOCK);
			on = true;
		}

		keyUse(KeyEvent.VK_HOME);
		delay(delayLength);
		keyPress(KeyEvent.VK_SHIFT);
		delay(delayLength);
		keyUse(KeyEvent.VK_END);
		delay(delayLength);
		keyRelease(KeyEvent.VK_SHIFT);

		if (on)
		{
			keyUse(KeyEvent.VK_NUM_LOCK);
			on = false;
		}
	}

	public void moveSelect2(int _x, int _y)
	{
		mouseMove(_x, _y);
		mousePress(InputEvent.BUTTON1_DOWN_MASK);
		delay(delayLength);
		mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		keyPress(KeyEvent.VK_CONTROL);
		keyUse(KeyEvent.VK_A);
		keyRelease(KeyEvent.VK_CONTROL);
	}

	public String readSelected()
	{
		keyPress(KeyEvent.VK_CONTROL);
		delay(delayLength);
		keyUse(KeyEvent.VK_C);
		keyRelease(KeyEvent.VK_CONTROL);
		delay(delayLength*3);

		String result = null;

		try
		{
			result = (String) ShopOrderHelper.clipboard.getData(DataFlavor.stringFlavor);
		}
		catch (UnsupportedFlavorException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return result;
	}

}