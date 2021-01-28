package com.wuwenwen03;

import java.util.List;
import java.util.ArrayList;

public class UuserDB {
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User("洋洋","123456"));
		users.add(new User("周懿","123"));
		users.add(new User("文文","123456"));
		users.add(new User("文哥","123"));
	}
	
	public static List<User> getUsers(){
		return users;
	}
}
