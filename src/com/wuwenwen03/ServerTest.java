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
		//����������Socket����
		ServerSocket ss = new ServerSocket(10086);
		//����
		Socket s = ss.accept();
		//��ȡ����������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ�û���������
		String user = br.readLine();
		String psw = br.readLine();
		//�ж��û����������Ƿ���ȷ
		boolean flag = false;
		/*if("admin".equals(user) && "123456".equals(psw)) {
			flag = true; 
		}*/
		
		List<User> users = UuserDB.getUsers();
		User username = new User(user,psw);
		if(users.contains(username)) {
			//ƥ��ɹ�
			flag = true;
		}
		
		//��ȡ���������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		//�����ж���Ϣ
		if(flag) {
			out.println("��¼�ɹ�");
		}else {
			out.println("��¼ʧ��");
		}
		//�ͷ���Դ
		s.close();
		//ss.close();//������һ�㲻�ر�
	}
}
