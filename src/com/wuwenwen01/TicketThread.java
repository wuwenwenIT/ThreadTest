package com.wuwenwen01;
/*
 * 
 * 
 * 用synchronized :同步锁，可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他线程无法访问
 * 同步代码块：
 *            synchronized(锁对象){
 *            
 *            }
 * 
 * 注意：锁对象需要被所有线程所共享
 * 同步：安全性高，效率低
 * 
 * 1.非静态同步方法的锁对象是this
 * 2.静态的同步方法的锁对象是当前类的字节码对象
 */
public class TicketThread implements Runnable {
	int tickets  =100;//火车票数量
	Object mutex = new Object();
	
	public void run() {
		//出售火车票
		while(true) {
			synchronized(mutex) {
				
				method();
			}
		}
	}

	private void method() {
		//当火车票小于0，停止售票
		if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"="+tickets--);
		}
	}
}
