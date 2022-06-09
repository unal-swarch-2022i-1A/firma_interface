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
import com.firma.interfaz.stub.GetProfile;
import com.firma.interfaz.stub.GetProfileResponse;
import com.firma.interfaz.stub.ObjectFactory;
import com.firma.interfaz.stub.Profile;

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
	public Profile sum(@RequestParam int id) {
	ObjectFactory objectFactory = new ObjectFactory();
	GetProfile request = new GetProfile();
	request.setId(id);
//	request.setId(id);
////	user.se.setBlz(code);
////	// BlzServiceAdapter blzServiceAdapter=new BlzServiceAdapter();
////
	GetProfileResponse response = soapClient.getProfile("https://interface-y6bebo7xta-uc.a.run.app/tUNderProfilesWS.asmx",
			request);
	return response.getGetProfileResult();
	}
}
