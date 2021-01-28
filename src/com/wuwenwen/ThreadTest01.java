package com.wuwenwen;

public class ThreadTest01 {
	public static void main(String[] args) {
		//创建线程实例
		Test01 t = new Test01();
		Thread tt = new Thread(t);
		tt.setName("自强独立");
		//启动线程
		tt.start();
	}
}
