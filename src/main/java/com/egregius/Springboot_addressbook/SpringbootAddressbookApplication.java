package com.egregius.Springboot_addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@SpringBootApplication
public class SpringbootAddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAddressbookApplication.class, args);
	}

	@Bean
	public Docket swaggerconfiguaration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.egregius"))
				.build()
				.apiInfo(apiDetails());



	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Address book API",
				"Sample API for JavaClass tutorial",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Ayobami Olaniyi","http://egregius.com", "daeegregius@gmail.com"),
				"API License",
				"http://egregius.com",
				Collections.emptyList());

	}
}


