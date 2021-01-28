package com.wuwenwen;

public class ThreadTest {
	public static void main(String[] args) {
		//创建线程实例
		MyThread mt = new MyThread();
		
		//修改线程名字
		mt.setName("洋洋");
		
		//启动线程
		mt.start();
		
		//创建线程实例
		MyThread mt2 = new MyThread();
		
		//修改线程名字
		mt2.setName("文哥");
		
		//启动线程
		mt2.start();
	}
}
