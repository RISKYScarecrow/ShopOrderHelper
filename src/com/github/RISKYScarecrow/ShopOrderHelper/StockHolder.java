package com.github.RISKYScarecrow.ShopOrderHelper;

public class StockHolder
{
	String barcode;

	String nameStr;
	boolean nameBool = true;
	String pluStr;
	boolean pluBool = true;
	String realStr;
	boolean realBool = true;
	String retailStr;
	boolean retailBool = true;
	String SOHStr;
	boolean SOHBool = true;

	DataCollector dc = new DataCollector();

	public StockHolder(String barcode)
	{
		this.barcode = barcode;

	}

	public void getData()
	{
		dc.openProduct(barcode);
		if (nameBool)
		{
			nameStr = dc.getName();
		}

		if (pluBool)
		{
			pluStr = dc.getPLU();
		}

		if (realBool)
		{
			realStr = dc.getRealCost();
		}

		if (retailBool)
		{
			retailStr = dc.getRetailCost();
		}

		if (SOHBool)
		{
			SOHStr = dc.getStockOnHand();
		}
		dc.closeProduct();
	}
}
