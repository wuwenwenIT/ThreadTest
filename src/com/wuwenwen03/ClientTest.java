package com.wuwenwen03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 
 *  模拟用户登录 
 * 
 * 
 */

public class ClientTest {
	public static void main(String[] args) throws IOException {
		//获取客户端Socket对象
		Socket s = new Socket("localhost",10086);
		//获取用户名和密码
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入你的用户名：");
		String user = br.readLine();
		System.out.println("请输入你的密码：");
		String psw = br.readLine(); 
		//获取输出流对象
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		//写出数据
		out.println(user);
		out.println(psw);
		//获取输入流对象
		BufferedReader serverbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//获取服务器返回的数据
		String res = serverbr.readLine();
		System.out.println(res);
		//释放资源
		s.close();
		
		
	}
}
