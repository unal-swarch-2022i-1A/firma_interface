/**
 * 
 */
package com.firma.interfaz.repositories;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.User;

/**
 * @author Marcos
 *
 */
@Component
public class UserRepository {
	private static final Map<Integer, User> users = new HashMap<>();
	
	@PostConstruct
	public void initData() {
		User nicolas = new User();
		nicolas.setFirstName("Nicolas");
		nicolas.setLastName("La Rotta");
		nicolas.setId(10);
		nicolas.setEmail("testemail@somewhere.com");

		users.put(nicolas.getId(), nicolas);

	}

	public User findUser(int id) {
		Assert.notNull(id, "The country's name must not be null");
		return users.get(id);
	}
	
}
