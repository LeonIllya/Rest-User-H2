package com.example.app.RestUserH2;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RestUserH2Application {

	public static void main(String[] args) {

		new SpringApplicationBuilder(RestUserH2Application.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		System.out.println("App running ...");
	}

}
