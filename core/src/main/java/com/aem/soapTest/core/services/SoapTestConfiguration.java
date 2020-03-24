package com.aem.soapTest.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Testing Soap Web Service", description = "Taking End point URL as the input.")
public @interface SoapTestConfiguration {

	@AttributeDefinition(
			name = "Input the end point url of the web service", 
			description = "Input the end point url of the web service", 
			type = AttributeType.STRING)
	String getEndPointUrl() default "Please enter the URL.";
}
