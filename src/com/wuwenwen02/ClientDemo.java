package com.wuwenwen02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 
 * 
 *   需求：使用TCP协议发生数据，并将收到的数据转换成大写后返回
 *   
 *   客户端发生数据
 *   服务端接受数据
 *   服务端转换数据
 *   
 *   服务端发送数据
 *   客户端接受数据
 * 
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket对象
		Socket s = new Socket(InetAddress.getByName("localhost"),10086);
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		//发出数据
		os.write("tcp,in comming again!!!".getBytes());
		
		
		//获取输入流对象
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//输出数据
		System.out.println(new String(bys,0,len));
		
		//释放资源
		s.close();
		
	}
}
