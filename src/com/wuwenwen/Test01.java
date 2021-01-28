package com.wuwenwen;

public class Test01 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
//			Thread t = Thread.currentThread();
//			System.out.println(t.getName()+"="+i);
			
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
}
