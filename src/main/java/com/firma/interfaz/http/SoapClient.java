package com.firma.interfaz.http;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.firma.interfaz.stub.GetProfile;
import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {

	public GetProfile getProfile(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (GetProfile) res.getValue();
	}
}