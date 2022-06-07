/**
 * 
 */
package com.firma.interfaz.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.firma.interfaz.entites.User;

/**
 * @author Marcos
 *
 */
@Component
public class UserRepository {
	private static final Map<Integer, User> countries = new HashMap<>();
}
