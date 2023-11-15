package com.kb.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.persistence.PersistenceException;
import org.junit.jupiter.api.Test;
import com.kb.dao.UserDao;
import com.kb.entity.User;

public class UserTest 
{
@Test
void testPosSaveuser()
{
	User u1=new User();
	u1.setName("ganesh");
	u1.setId(112);
	u1.setSal(3213.13);	
	User expectedOutput =u1;
	User actualOutput=new UserDao().saveUser(u1);	
	assertEquals(expectedOutput, actualOutput);
}
@Test
void testNegSaveuser()
{
	User u1=new User();
	u1.setName("boss");
	u1.setId(12);
	u1.setSal(3213.13);	
	assertThrows(PersistenceException.class, () -> {
		new UserDao().saveUser(u1);
	});	
	}
}
