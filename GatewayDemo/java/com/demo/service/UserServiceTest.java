package com.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * UserServiceTest.java
 * @author technocrat
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/application-config.xml", "classpath:spring/mvc-config.xml"})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testLoadUserByUsername() {}

}
