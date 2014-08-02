package com.github.RISKYScarecrow.ShopOrderHelper;

public class DataCollector
{
	public DataCollector()
	{
	}

	public void openProduct(String searchTerm)
	{
		ShopOrderHelper.robot.moveSelect(910, 486);
		ShopOrderHelper.robot.typeString(searchTerm);
		ShopOrderHelper.robot.pressEnter();
	}
	
	public void closeProduct()
	{
		ShopOrderHelper.robot.keyCommand("r");
	}

	public String getName()
	{
		ShopOrderHelper.robot.moveSelect(334, 215);
		return ShopOrderHelper.robot.readSelected();
	}

	public String getPLU()
	{
		ShopOrderHelper.robot.moveSelect(334, 265);
		return ShopOrderHelper.robot.readSelected();
	}

	public String getRealCost()
	{
		ShopOrderHelper.robot.switchTab(1);
		ShopOrderHelper.robot.moveSelect(1522, 337);
		return ShopOrderHelper.robot.readSelected();
	}
	
	public String getRetailCost()
	{
		ShopOrderHelper.robot.switchTab(1);
		ShopOrderHelper.robot.moveSelect(1522, 415);
		return ShopOrderHelper.robot.readSelected();
	}
	
	public String getStockOnHand()
	{
		ShopOrderHelper.robot.switchTab(2);
		ShopOrderHelper.robot.moveSelect(1265, 520);
		return ShopOrderHelper.robot.readSelected();
	}
}
