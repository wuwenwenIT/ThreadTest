package com.wuwenwen;

public class ThreadTest {
	public static void main(String[] args) {
		//�����߳�ʵ��
		MyThread mt = new MyThread();
		
		//�޸��߳�����
		mt.setName("����");
		
		//�����߳�
		mt.start();
		
		//�����߳�ʵ��
		MyThread mt2 = new MyThread();
		
		//�޸��߳�����
		mt2.setName("�ĸ�");
		
		//�����߳�
		mt2.start();
	}
}
