package com.smartresidesolutions.SmartResideServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = "com.smartresidesolutions",
includeFilters = @Filter(type = FilterType.REGEX, pattern="com.smartresidesolutions.*")) 
public class SmartResideServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartResideServerApplication.class, args);
	}
}
