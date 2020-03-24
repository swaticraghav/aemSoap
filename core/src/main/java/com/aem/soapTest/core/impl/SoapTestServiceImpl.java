package com.aem.soapTest.core.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.Designate;

import com.aem.soapTest.core.services.SoapTestConfiguration;
import com.aem.soapTest.core.services.SoapTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = SoapTestService.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = SoapTestConfiguration.class)
public class SoapTestServiceImpl implements SoapTestService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	private SoapTestConfiguration config;

	@Override
	public String getEndPointUrl() {
		logger.error("Inside of Method!");
		logger.error("URL: " + config.getEndPointUrl());
		return "Url is: " + config.getEndPointUrl();
	}
	
	@Activate
	public void activate(SoapTestConfiguration config) {
		this.config = config;
	}

}
