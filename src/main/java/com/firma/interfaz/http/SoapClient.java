package com.firma.interfaz.http;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.firma.interfaz.stub.GetProfile;
import com.firma.interfaz.stub.GetProfileResponse;

import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {

	public GetProfileResponse getProfile(String url, int id) {
		GetProfile request = new GetProfile();
		request.setId(id);
		GetProfileResponse response = (GetProfileResponse)getWebServiceTemplate().marshalSendAndReceive(url, request);
		return  response;
	}
}