package com.firma.interfaz.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.firma.interfaz.http.SoapClient;

@Configuration
public class BeanConsumer {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.firma.interfaz.stub");
		return marshaller;
	}

	@Bean
	public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
		SoapClient client = new SoapClient();
		client.setDefaultUri("https://interface-y6bebo7xta-uc.a.run.app/tUNderProfilesWS.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
