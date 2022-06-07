package com.firma.interfaz.http;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import com.firma.interfaz.stub.GetUserRequest;
import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {

	public GetUserRequest getUser(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (GetUserRequest) res.getValue();
	}
}