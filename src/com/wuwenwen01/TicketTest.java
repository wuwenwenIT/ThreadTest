package com.wuwenwen01;
/*
 * ģ���վ��
 * 1.��Ʊ������
 * 2.��Ʊ������С��1��ֹͣ��Ʊ
 * 3.ʹ�ö��߳̽�����Ʊ
 * 4.��Ʊ����
 * 
 */
public class TicketTest {
	public static void main(String[] args) {
		//�����̶߳���
		TicketThread tt = new TicketThread();
		
		Thread t1 = new Thread(tt);
		t1.setName("����1");
		Thread t2 = new Thread(tt);
		t2.setName("����2");
		Thread t3 = new Thread(tt);
		t3.setName("����3");
		
		//�����̶߳���
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
