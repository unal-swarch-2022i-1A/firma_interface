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
	public GetProfileResponse sum(@RequestParam int id) {


	GetProfileResponse response = soapClient.getProfile("http://interface-y6bebo7xta-uc.a.run.app/tUNderProfilesWS.asmx", id);

	return response;//response.getDetails();
	}
}
