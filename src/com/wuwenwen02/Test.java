package com.wuwenwen02;

import java.net.InetAddress;

public class Test {
	public static void main(String[] args) {
		try{
			
			java.net.InetAddress ia = InetAddress.getByName("localhost");
			String ip = ia.getHostAddress();
			String name= ia.getHostName();
			System.out.println(ip);
			System.out.println(name);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


	}
}
