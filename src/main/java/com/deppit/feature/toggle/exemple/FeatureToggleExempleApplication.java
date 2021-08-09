package com.deppit.feature.toggle.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories(basePackages = "com.deppit.feature.toggle.exemple.repository")
public class FeatureToggleExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureToggleExempleApplication.class, args);
	}

}
