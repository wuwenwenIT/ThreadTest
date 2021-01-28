package com.wuwenwen01;
/*
 * 模拟火车站：
 * 1.火车票的总数
 * 2.火车票的数量小于1，停止售票
 * 3.使用多线程进行售票
 * 4.火车票售完
 * 
 */
public class TicketTest {
	public static void main(String[] args) {
		//创建线程对象
		TicketThread tt = new TicketThread();
		
		Thread t1 = new Thread(tt);
		t1.setName("窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		
		//启动线程对象
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
