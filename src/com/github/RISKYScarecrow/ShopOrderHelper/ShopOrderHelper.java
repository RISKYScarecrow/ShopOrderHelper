package com.github.RISKYScarecrow.ShopOrderHelper;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class ShopOrderHelper
{

	public static ExtendedRobot robot;
	public static Toolkit toolkit;
	public static Clipboard clipboard;

	public static void main(String[] args) throws AWTException
	{

		//GUI myGUI = new GUI();
		//Thread gui = myGUI;
		//gui.start();
		
		
		
		robot = new ExtendedRobot();
		toolkit = Toolkit.getDefaultToolkit();
		clipboard = toolkit.getSystemClipboard();

		robot.delay(5000);

		StockHolder stock = new StockHolder("902166");
		stock.getData();
		
		//robot.moveSelect2(170, 40);
		//String m = robot.readSelected();
		//System.out.println(m);
		//myGUI.updateLabel(m);
	}

	

}
/*
 * Server code for push and pull import java.io.DataInputStream; import
 * java.io.DataOutputStream; import java.io.IOException; import
 * java.net.ServerSocket; import java.net.Socket; import
 * java.net.SocketTimeoutException;
 * 
 * public class SimpleServer extends Thread { private ServerSocket serverSocket;
 * 
 * public SimpleServer(int port) throws IOException { serverSocket = new
 * ServerSocket(port); serverSocket.setSoTimeout(10000); }
 * 
 * public void run() { while (true) { try {
 * System.out.println("Waiting for client on port " +
 * serverSocket.getLocalPort() + "..."); Socket server = serverSocket.accept();
 * System.out.println("Just connected to " + server.getRemoteSocketAddress());
 * DataInputStream in = new DataInputStream(server.getInputStream());
 * System.out.println(in.readUTF()); DataOutputStream out = new
 * DataOutputStream(server.getOutputStream());
 * out.writeUTF("Thank you for connecting to " +
 * server.getLocalSocketAddress()); for (int i = 0; i < 10; i++) {
 * out.writeUTF("Iteration " + i); try { Thread.sleep(100); } catch
 * (InterruptedException e) { e.printStackTrace(); } } out.writeUTF("Goodbye!");
 * out.writeUTF("Kill connection"); server.close(); } catch
 * (SocketTimeoutException s) { System.out.println("Socket timed out!"); break;
 * } catch (IOException e) { e.printStackTrace(); break; } }
 * System.out.println("End!"); }
 * 
 * public static void main(String[] args) { int port =
 * Integer.parseInt(args[0]); try { Thread t = new SimpleServer(port);
 * t.start(); } catch (IOException e) { e.printStackTrace(); } } }
 */
