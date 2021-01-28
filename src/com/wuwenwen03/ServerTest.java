package com.wuwenwen03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerTest {
	public static void main(String[] args) throws IOException {
		//创建服务器Socket对象
		ServerSocket ss = new ServerSocket(10086);
		//监听
		Socket s = ss.accept();
		//获取输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//获取用户名和密码
		String user = br.readLine();
		String psw = br.readLine();
		//判断用户名和密码是否正确
		boolean flag = false;
		/*if("admin".equals(user) && "123456".equals(psw)) {
			flag = true; 
		}*/
		
		List<User> users = UuserDB.getUsers();
		User username = new User(user,psw);
		if(users.contains(username)) {
			//匹配成功
			flag = true;
		}
		
		//获取输出流对象
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		//返回判断信息
		if(flag) {
			out.println("登录成功");
		}else {
			out.println("登录失败");
		}
		//释放资源
		s.close();
		//ss.close();//服务器一般不关闭
	}
}
