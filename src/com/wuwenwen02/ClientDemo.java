package com.wuwenwen02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 
 * 
 *   ����ʹ��TCPЭ�鷢�����ݣ������յ�������ת���ɴ�д�󷵻�
 *   
 *   �ͻ��˷�������
 *   ����˽�������
 *   �����ת������
 *   
 *   ����˷�������
 *   �ͻ��˽�������
 * 
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//�����ͻ���Socket����
		Socket s = new Socket(InetAddress.getByName("localhost"),10086);
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		//��������
		os.write("tcp,in comming again!!!".getBytes());
		
		
		//��ȡ����������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//�������
		System.out.println(new String(bys,0,len));
		
		//�ͷ���Դ
		s.close();
		
	}
}
