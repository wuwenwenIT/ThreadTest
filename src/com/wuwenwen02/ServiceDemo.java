package com.wuwenwen02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {
	public static void main(String[] args) throws IOException {
		//���������Socket����
		ServerSocket ss = new ServerSocket(10086);
		//����
		Socket s = ss.accept();
		//��ȡ����������
		InputStream is = s.getInputStream();
		//��ȡ����
		byte[] bys = new byte[1024];
		int len;//���Դ洢��ȡ�����ֽڸ���
		len = is.read(bys);
		String str = new String(bys,0,len);
		//�������
		System.out.println(str);
		
		//ת������
		String upperStr = str.toUpperCase();
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		//��������
		os.write(upperStr.getBytes());
		
		
		//�ͷ���Դ
		s.close();
//		ss.close(); //�����һ�㲻�ر�
	}
}
