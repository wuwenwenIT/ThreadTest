package com.wuwenwen03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 
 *  ģ���û���¼ 
 * 
 * 
 */

public class ClientTest {
	public static void main(String[] args) throws IOException {
		//��ȡ�ͻ���Socket����
		Socket s = new Socket("localhost",10086);
		//��ȡ�û���������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����������û�����");
		String user = br.readLine();
		System.out.println("������������룺");
		String psw = br.readLine(); 
		//��ȡ���������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		//д������
		out.println(user);
		out.println(psw);
		//��ȡ����������
		BufferedReader serverbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ���������ص�����
		String res = serverbr.readLine();
		System.out.println(res);
		//�ͷ���Դ
		s.close();
		
		
	}
}
