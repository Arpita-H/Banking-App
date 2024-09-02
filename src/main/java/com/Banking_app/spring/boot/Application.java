package com.Banking_app.spring.boot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking App",
				description = "Backend Rest APIs for Banking App",
				version = "v1.0",
				contact = @Contact(
						name = "Arpita S H",
						email = "arpitash7204@gmail.com",
						url = "https://github.com/Arpita-H/Banking-App"
				),
				license = @License(
						name = "Banking App",
						url = "https://github.com/Arpita-H/Banking-App"
				)
		)
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
