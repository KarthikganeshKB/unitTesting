package com.kb.controller;

import com.kb.dao.UserDao;
import com.kb.entity.User;

public class UserMain
{
public static void main(String[] args) 
{
	User u1=new User();
	u1.setName("Karthik");
	u1.setId(1);
	u1.setSal(234.56);
	
	UserDao ud=new UserDao();
	ud.saveUser(u1);
		
}
}
