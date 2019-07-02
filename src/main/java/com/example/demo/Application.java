package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@MapperScan("com.example.demo")
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/*			private final PersonMapper personMapper;

				public Application(PersonMapper personMapper) {
				    this.personMapper = personMapper;
				}

				@Override
				public void run(String... args) throws Exception {
					Person person = personMapper.findById(1);
					System.out.println(person.getId() + "," + person.getName() + "," + person.getHobby());
				}*/


}
