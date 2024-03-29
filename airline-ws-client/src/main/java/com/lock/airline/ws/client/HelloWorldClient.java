package com.lock.airline.ws.client;

import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.client.core.WebServiceTemplate;

public class HelloWorldClient {
	private static final String MESSAGE = "<message xmlns=\"http://tempuri.org\">Hello Web Service World</message>";
	private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

	public void setDefaultUri(String defaultUri) {
		webServiceTemplate.setDefaultUri(defaultUri);
	}

	// send to the configured default URI
	public void simpleSendAndReceive() {
		StreamSource source = new StreamSource(new StringReader(MESSAGE));
		StreamResult result = new StreamResult(System.out);
		webServiceTemplate.sendSourceAndReceiveToResult(source, result);
	}

	// send to an explicit URI
	public void customSendAndReceive() {
			StreamSource source = new StreamSource(new StringReader(MESSAGE));
			StreamResult result = new StreamResult(System.out);
			webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:8080/wsAnotherWebService",
			source, result);
	}
}
