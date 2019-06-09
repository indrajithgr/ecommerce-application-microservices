package com.learning.tradingportalcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TradingPortalCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingPortalCloudServerApplication.class, args);
	}

}
