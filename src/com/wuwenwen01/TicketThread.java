package com.wuwenwen01;
/*
 * 
 * 
 * ��synchronized :ͬ�������������δ����ͷ����������εĴ����ͷ���һ����ĳ���̷߳��ʣ���ֱ����ס�������߳��޷�����
 * ͬ������飺
 *            synchronized(������){
 *            
 *            }
 * 
 * ע�⣺��������Ҫ�������߳�������
 * ͬ������ȫ�Ըߣ�Ч�ʵ�
 * 
 * 1.�Ǿ�̬ͬ����������������this
 * 2.��̬��ͬ���������������ǵ�ǰ����ֽ������
 */
public class TicketThread implements Runnable {
	int tickets  =100;//��Ʊ����
	Object mutex = new Object();
	
	public void run() {
		//���ۻ�Ʊ
		while(true) {
			synchronized(mutex) {
				
				method();
			}
		}
	}

	private void method() {
		//����ƱС��0��ֹͣ��Ʊ
		if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"="+tickets--);
		}
	}
}
