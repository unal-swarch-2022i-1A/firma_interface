/**
 * 
 */
package com.firma.interfaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.firma.interfaz.http.SoapClient;
import com.firma.interfaz.stub.GetUserResponse;
import com.firma.interfaz.stub.ObjectFactory;
/**
 * @author Marcos
 *
 */

@RestController
@RequestMapping("/")
public class RestControllerApi {

	@Autowired
	private SoapClient soapClient;
	
	@GetMapping
	public GetUserResponse sum(@RequestParam String code) {
	ObjectFactory objectFactory = new ObjectFactory();
	GetUserResponse user = new GetUserResponse();
//	user.se.setBlz(code);
//	// BlzServiceAdapter blzServiceAdapter=new BlzServiceAdapter();
//
//	GetBankResponseType response = soapClient.getBank("http://www.thomas-bayer.com/axis2/services/BLZService",
//	objectFactory.createGetBank(type));
	return null;//response.getDetails();
	}
}
