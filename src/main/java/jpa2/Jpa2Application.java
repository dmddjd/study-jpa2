package jpa2;

import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Jpa2Application {
	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}
//    @Bean
//    Hibernate6JakartaModule hibernate6JakartaModule() {
//        return new Hibernate6JakartaModule
//    }
}