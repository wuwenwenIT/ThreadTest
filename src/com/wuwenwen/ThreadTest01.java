package com.wuwenwen;

public class ThreadTest01 {
	public static void main(String[] args) {
		//�����߳�ʵ��
		Test01 t = new Test01();
		Thread tt = new Thread(t);
		tt.setName("��ǿ����");
		//�����߳�
		tt.start();
	}
}
