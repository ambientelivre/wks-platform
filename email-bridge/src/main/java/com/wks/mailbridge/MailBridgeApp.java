package com.wks.mailbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author victor.franca
 *
 */
@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class })
@ComponentScan(basePackages = { "com.wks.bpm", "com.wks.caseengine", "com.wks.rest.client", "com.wks.mailbridge" })
public class MailBridgeApp {

	public static void main(String[] args) {
		SpringApplication.run(MailBridgeApp.class, args);
	}

}
