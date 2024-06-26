package com.hamed.MyWebApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyWebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyWebAppApplication.class, args);
	}


}
