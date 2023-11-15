package com.kb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.kb.entity.User;

public class UserDao 
{
public User saveUser(User user)
{
	EntityManager entityManager=Persistence.createEntityManagerFactory("karthik").createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(user);
	entityTransaction.commit();
	return user;
}
public User getUser(int  id)
{
	EntityManager entityManager=Persistence.createEntityManagerFactory("karthik").createEntityManager();
	return entityManager.find(User.class,id);
}
}
