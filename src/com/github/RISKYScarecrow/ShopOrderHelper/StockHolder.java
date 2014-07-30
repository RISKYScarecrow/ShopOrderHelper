package com.github.RISKYScarecrow.ShopOrderHelper;


public class StockHolder
{
  String name;
  String plu;
  String barcode;
  
 public StockHolder()
 {
   
 }
 
   
 public StockHolder(String barcode)
 {
   this.barcode = barcode;
 }
 
 public StockHolder(String par1, String par2, String par3)
 {
   name = par1;
   plu = par2;
   barcode = par3;
 }
  
}
