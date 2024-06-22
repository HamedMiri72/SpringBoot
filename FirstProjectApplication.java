package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.show();

//		Alien a2 = context.getBean(Alien.class);
//		a2.show();

		//even if we have to object name it will create just one object for us
		//becuse springboot in default uses singltone design pattern so in singelton we get just one object


	}
}


//@SpringBootApplication
//
//public class FirstProjectApplication {
//
//	public static void main(String[] args) {
//
//		//run method retuns an object of configurableapplicationcontext
//
//		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
//
//		//how to create an object of alian here
//
//		Alien a = context.getBean(Alien.class);
//		a.show();
//	}
//
//}
