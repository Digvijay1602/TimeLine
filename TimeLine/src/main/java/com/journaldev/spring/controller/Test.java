package com.journaldev.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.journaldev.spring.model.User;

public class Test {
	
	

	public static void main(String[] args) {
		int naveen=5;
		String navee1="Test";
		boolean naveen2=false;
		ArrayList<String> naveen3=new ArrayList<String>();
		naveen3.add("sasa");
		naveen3.add("saddsdssa");
		naveen3.add("sasdsda");
		
		User user=new User();
		user.setUserid(1);
		user.setUserName("Naveen");
		user.setUserAddr("Address1");
		
		Map<Integer, User> mappper=new HashMap<>();
		mappper.put(user.getUserid(), user);
		
		
		
		
		/*for (int i = 0; i < naveen3.size(); i++) {
			System.out.println(naveen3.get(i));
		}*/
		for (String nav : naveen3) {
			System.out.println(nav);
			
		}
		
	}
}
