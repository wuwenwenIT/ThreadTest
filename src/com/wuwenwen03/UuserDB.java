package com.wuwenwen03;

import java.util.List;
import java.util.ArrayList;

public class UuserDB {
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User("����","123456"));
		users.add(new User("��ܲ","123"));
		users.add(new User("����","123456"));
		users.add(new User("�ĸ�","123"));
	}
	
	public static List<User> getUsers(){
		return users;
	}
}
